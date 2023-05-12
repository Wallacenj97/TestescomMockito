package br.com.senactestes.mockitoclass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {
	
	@Mock
	private ApiDosCorreios apiDosCorreios;
	
	@InjectMocks
	private CadastrarPessoa cadastrarPessoa;
	
	@Test
	void cadastrarPessoa(){
		
		//Dados ficticios do objeto que eu estou mocando
		DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP","Atibaia","Rua Antoni Massoni","Casa");
		
		//1.3.Execucao do mock
		Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao);
		
		Pessoa Wallace = cadastrarPessoa.cadastrarPessoa("Wallace", "13345676", LocalDate.of(1997, 4, 23),"12345630");
		
		//2.execucao e analise (asserts) do teste
		DadosLocalizacao enderecoWallace = Wallace.getEndereco();
		assertEquals(dadosLocalizacao.getBairro(), enderecoWallace.getBairro());
		assertEquals(dadosLocalizacao.getCidade(), enderecoWallace.getCidade());
		assertEquals(dadosLocalizacao.getUf(), enderecoWallace.getUf());
		
	}
	
	
	
	
	

}
