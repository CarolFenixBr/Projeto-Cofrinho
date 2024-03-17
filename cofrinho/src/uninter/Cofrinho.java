package uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> ListMoedas;
	
	public Cofrinho() {
		this.ListMoedas = new ArrayList<>();
	}
	
	public void adicionar(Moeda moeda) {
		this.ListMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.ListMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		
		if(this.ListMoedas.isEmpty()) {
			System.out.println("Não existe nenhuma moeda no cofrinho!");
			return;
		}
		
		for (Moeda moeda : this.ListMoedas) {
			moeda.info();
		}
	}	

	public double totalConvertido() {
		
		if (this.ListMoedas.isEmpty()) {
		return 0;
	
	}
	 double valorAcumulado = 0;
	 
	 for (Moeda moeda : this.ListMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
	 return valorAcumulado;
	 
		

	}
}

