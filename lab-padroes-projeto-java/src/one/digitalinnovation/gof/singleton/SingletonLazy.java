package one.digitalinnovation.gof.singleton;
/**
 * 
 * Singleton "preguiçoso"
 * 
 */

public class SingletonLazy {
	//singleton preguiçoso ele não disponibiliza a instancia pro usuario
	private static SingletonLazy instancia;
	
	//tem que ser private para ninguem instanciar 
	private SingletonLazy() {
		super();
	}
	
	//garantindo que essa instancia vai ser exposta pra quem ta chamando
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			//se ela for nula, instanciamos ela para poder retornar
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
