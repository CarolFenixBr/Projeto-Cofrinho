package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc; //aqui estou adicionando o Scanner para importar, somente clicar em cima do Scanner ja aparece a opção de import que é adicionado ali em cima abaixo do package
	private Cofrinho cofrinho;
	
	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void exibirMenuPrincipal() { //a ser exibido para o usuário
		System.out.println("Seja Bem vindo(a) ao Bank CV, escolha uma opção abaixo:"); //CV é abreviação do meu nome Caroline Vargas
		System.out.println("1- Adicionar moeda:");
		System.out.println("2- Remover moeda:");
		System.out.println("3- Listar moedas:");
		System.out.println("4- Calcular valor total convertido para real:");
		System.out.println("0- Encerrar");
		
		String opcaoSelecionada = sc.next(); //quando digito o next permite ao usúario que ele digite um valor e será guardado o resultado numa variável
		
		switch(opcaoSelecionada) { //casos para serem tratados, o usuário deverá escolher uma opção
		
			case "0":
				System.out.println("Obrigado por utilizar nossos serviços. Bank CV agradece, tenha um bom dia!");
				break;
				
			case "1":
				exibirSubMenuAdicionarMoedas();	
				exibirMenuPrincipal();
				break;
				
			case "2":
				exibirSubMenuRemoverMoedas();	
				exibirMenuPrincipal();
				break;
				
			case "3":
				cofrinho.listagemMoedas();
				exibirMenuPrincipal();
				break;
				
			case "4":
				double valorTotalConvertido = cofrinho.totalConvertido();
				System.out.println("O valor convertido em real é?"+ valorTotalConvertido);
				exibirMenuPrincipal();
				break;
				
			default:
				System.out.println("Opção inválida!");
				exibirMenuPrincipal();
				break;
					
		}
	}
	
	private void exibirSubMenuAdicionarMoedas() { //adicionar moedas
		System.out.println("Escolha uma moeda:");
		System.out.println("1- Real");
		System.out.println("2- Dólar");
		System.out.println("3- Euro");
		
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite o valor:");
		
		String valorMoedatexto = sc.next();
		valorMoedatexto = valorMoedatexto.replace(",",".");				
		double valorMoeda = Double.parseDouble(valorMoedatexto);
		
		Moeda moeda =null;
		
		if (opcaoMoeda == 1) {					
			moeda = new Real(valorMoeda);
		}else if (opcaoMoeda ==2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda ==3) {
			moeda = new Euro(valorMoeda);			
		}else {
			System.out.println("Não existe essa moeda!");
			exibirMenuPrincipal();
		}
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada com sucesso!");
	}
	
	private void exibirSubMenuRemoverMoedas() { //remover moedas
		System.out.println("Escolha uma moeda:");
		System.out.println("1- Real");
		System.out.println("2- Dólar");
		System.out.println("3- Euro");
		
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite o valor:");
		
		String valorMoedatexto = sc.next();
		valorMoedatexto = valorMoedatexto.replace(",",".");				
		double valorMoeda = Double.parseDouble(valorMoedatexto);
		
		Moeda moeda =null;
		
		if (opcaoMoeda == 1) {					
			moeda = new Real(valorMoeda);
		}else if (opcaoMoeda ==2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda ==3) {
			moeda = new Euro(valorMoeda);			
		}else {
			System.out.println("Não existe essa moeda!");
			exibirMenuPrincipal();
		}
		cofrinho.remover(moeda);
		System.out.println("Moeda removida com sucesso!");
	}
	
}
