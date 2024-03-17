package uninter;

public class Dolar extends Moeda{
	
	public Dolar(double valorPrincipal) {
		this.valor = valorPrincipal;
	}

	@Override
	public void info() {		
		System.out.println("Dólar - "+ valor);
		
	}

	@Override
	public double converter() {
		return  this.valor * 5.03; //retorna o valor de real * 5.03
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass()!= objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if (this.valor != objetoDeDolar.valor) {
			return false;
		}
		
		return true;
	}

}
