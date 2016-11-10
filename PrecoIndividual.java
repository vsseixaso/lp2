package ws_java;

import java.util.Scanner;

public class PrecoIndividual {
	public static int control = 0;
	public static String[] todosProdutos = new String[1000];
	public static double[] todosPrecos = new double[1000];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		printOpcoes();
		
		int op = sc.nextInt();
		sc.nextLine();
		while (op != 4) {
			switch(op) {
			case 1:
				System.out.print("Defina o produto: ");
				String novo = sc.nextLine();
				todosProdutos[control] = novo;
				System.out.print("Defina o preço: ");
				double preco = sc.nextDouble();
				sc.nextLine();
				todosPrecos[control] = preco;
				control++;
				break;
			case 2:
				printArray();
				System.out.print("O produto que deseja remover:");
				String rmv = sc.nextLine();
			}
		}
			
	}
		
	public static void printOpcoes(){
		System.out.println();
		System.out.println("Gerencia de Produtos!\nEscolha a operação:");
		System.out.println(" 1 - Adicionar produto \n 2 - Remover produto \n 3 - Mudar preço \n 4 - Retornar");
		System.out.println("\n Opção: ");
	}
	
	public static void printArray(){
		System.out.println();
		System.out.println("====================");
		for (int i = 0; i < control; i++) {
			System.out.println(i + ". " + todosProdutos[i]);
		}
		System.out.println("====================");
		System.out.println();
	}
}
