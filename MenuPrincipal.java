package ws_java;

import java.util.Scanner;

public class MenuPrincipal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printMenu();
		
		String opcao = sc.nextLine();
		while (!opcao.equals("3")) {
			switch(opcao) {
			//comprar
			case "1": 
				CompraLojaoP2.compra();
				printMenu();
				break;
				
			//gerenciar produtos
			case "2": 
				  System.out.println("Defina um novo preço.");
				  double preco = sc.nextDouble();
				  sc.nextLine();
				  CompraLojaoP2.preco_novo(preco);
				  System.out.println("O novo valor é: " + preco);
				  printMenu();
				  break;
			default: break;
			}
			opcao = sc.nextLine();
		}
	}
	public static void printMenu(){
		System.out.println();
		System.out.println("Bem vindo ao Lojão LP2!");
		System.out.println("Menu Inicial: Digite uma das opções abaixo: \n");
		System.out.println("1 - Realizar compra. \n2 - Gerenciar produtos. \n3 - Sair \n \nOpção:");
	}
}
