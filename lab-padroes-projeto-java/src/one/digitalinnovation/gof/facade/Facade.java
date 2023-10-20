package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

/**
 * A ideia da Facade é que seja uma interface e que dentro dela realize operações para podermos consolidar ou expor
 * uma interface mais simples para algo mais complexo 
 * 
 */	

public class Facade {
	
	//interface de uso da facade
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
