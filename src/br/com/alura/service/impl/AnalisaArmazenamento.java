package br.com.alura.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.alura.model.EnergiaRenovavel;
import br.com.alura.service.interf.ArmazenamentoDeEnergia;

public class AnalisaArmazenamento implements ArmazenamentoDeEnergia {

	@Override
	public List<EnergiaRenovavel> lerArquivo() throws IOException {

		try {
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(
					new FileReader("C:\\renewable-energy-stock-account-2007-18.csv"));

			reader.readLine(); // skips the first line

			String line = null;
			Scanner scanner = null;
			int index = 0;

			List<EnergiaRenovavel> energias = new ArrayList<EnergiaRenovavel>();

			while ((line = reader.readLine()) != null) {

				EnergiaRenovavel energia = new EnergiaRenovavel();

				scanner = new Scanner(line);
				scanner.useDelimiter(",");

				while (scanner.hasNext()) {
					String data = scanner.next();
					if (index == 0)
						energia.setYear(data);
					else if (index == 1)
						energia.setResource(data);
					else if (index == 2)
						energia.setVariable(data);
					else if (index == 3)
						energia.setUnits(data);
					else if (index == 4)
						energia.setMagnitude(data);
					else if (index == 5)
						energia.setSource(data);
					else if (index == 6)
						energia.setDataValue(data);
					else if (index == 7)
						energia.setFlag(data);
					index++;
				}
				index = 0;
				energias.add(energia);

			}
			reader.close();
			return energias;
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			return null;
		}
		
	}

	public void mostraLista(List<EnergiaRenovavel> energias) {
		for (EnergiaRenovavel energia : energias) {
			System.out.println(energia.toString());
		}
	}
}
