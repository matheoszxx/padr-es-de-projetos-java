package one.digitalinnovation.gof.strategy;

public class Robo {
	
	//propriedade 
	private Comportamento comportamento;

	//como o robo pode eventualmente mudar de estrategia, vamos criar o metodo set
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover(){
		comportamento.mover();
	}
		
}
