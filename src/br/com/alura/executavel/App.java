package br.com.alura.executavel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.model.EnergiaRenovavel;
import br.com.alura.service.impl.AnalisaArmazenamento;

public class App {

	public static void main(String[] args) throws IOException {
		
		List<EnergiaRenovavel> energias = new ArrayList<EnergiaRenovavel>();
		
		AnalisaArmazenamento analisaService = new AnalisaArmazenamento();
		energias = analisaService.lerArquivo();
		
		analisaService.mostraLista(energias);
		

	}
}
