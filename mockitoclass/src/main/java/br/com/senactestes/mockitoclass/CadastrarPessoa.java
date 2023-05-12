package br.com.senactestes.mockitoclass;

import java.time.LocalDate;

public class CadastrarPessoa {
	private ApiDosCorreios apiDosCorreios;

	public CadastrarPessoa(final ApiDosCorreios apiDosCorreiros) {
		this.apiDosCorreios = apiDosCorreiros;
	}
	
	public Pessoa cadastrarPessoa(String nome,String documento, LocalDate nascimento, String cep) {
		Pessoa pessoa =new Pessoa(nome, documento, nascimento);
		DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep(cep);
		pessoa.adicionaDadosDeEndereco(dadosLocalizacao);
		return pessoa;
	}

}
