package one.digitalinnovation.gof;
/**
 * 
 * Singleton "apressado"
 * 
 */

public class SingletonEager {
	//o Singleton apressado ele já atribui logo a instancia 
	private static SingletonEager instancia = new SingletonEager();
	
	
	private SingletonEager() {
		super();
	}
	
	
	public static SingletonEager getInstancia() {
		if (instancia == null) {
			
			instancia = new SingletonEager();
		}
		return instancia;
	}

}
