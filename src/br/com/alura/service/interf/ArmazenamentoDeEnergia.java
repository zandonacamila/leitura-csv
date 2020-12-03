package br.com.alura.service.interf;

import java.io.IOException;
import java.util.List;

import br.com.alura.model.EnergiaRenovavel;

public interface ArmazenamentoDeEnergia {

	public List<EnergiaRenovavel> lerArquivo() throws IOException;

//	public void mostraLista(List<EnergiaRenovavel> energias);
}
