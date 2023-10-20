package one.digitalinnovation.gof;
/**
 * 
 * Singleton "Lazy Holder"
 * 
 */

public class SingletonLazyHolder {
	
	//esse metodo ele vai encapsular a instancia em uma classe static interna
	private static class instanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	 
	
	private SingletonLazyHolder() {
		super();
	}
	
	//e aqui eu acesso a instancia pelo "instanceHolder" 
	public static SingletonLazyHolder getInstancia() {
		return instanceHolder.instancia;
	}

}
