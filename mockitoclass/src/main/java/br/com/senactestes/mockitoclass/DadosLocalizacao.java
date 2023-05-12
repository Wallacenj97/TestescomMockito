package br.com.senactestes.mockitoclass;

public class DadosLocalizacao {
	private String uf;
	private String cidade;
	private String bairro;
	private String logradouro;
	
	public DadosLocalizacao(String uf, String cidade, String bairro, String logradouro) {
		super();
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
	}
	
	public String getUf() {
		return uf;
	}
	public String getCidade() {
		return cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getBairro() {
		return bairro;
	}


	
}
