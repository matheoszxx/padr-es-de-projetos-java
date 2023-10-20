package one.digitalinnovation.gof.singleton;
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
	
	//então a instancia já é logo acionada 
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
