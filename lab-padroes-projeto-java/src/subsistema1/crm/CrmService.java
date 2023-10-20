package subsistema1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	//não precisamos instanciar essa classe, pois só tem um método static 
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistem de CRM.");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
