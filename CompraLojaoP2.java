package ws_java;

import java.util.Scanner;

public class CompraLojaoP2 {
	private static double preco_global = 1.99;
	public static void compra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo ao Lojão LP2!");
		System.out.print("Digite a quantidade de produtos diferentes que será comprada: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] produtos = new String[1000];
		int[] quantidade = new int[1000];
		
		int count = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Nome do Produto " + i + ": ");
			String x = sc.nextLine();
			produtos[i-1] = x;
			System.out.print("Quantidade de " + x + ": ");
			int y = sc.nextInt();
			sc.nextLine();
			quantidade[i-1] = y;
			count += y;
		}
		
		//gerar fatura
		System.out.println("-- Cadastro Concluído --");
		System.out.println("A sua compra foi:");
		for (int i = 0; i < n; i++) {
			int percentual = Math.round(quantidade[i]*100 / count);
			System.out.println(quantidade[i] + " " + produtos[i] + "(" + percentual + "%)");
		}
		System.out.println("Total de produtos: " + count);
		System.out.println("Total gasto: " + count*preco_global);
		System.out.println("-- Fim da execução --");
	}
	
	public static void preco_novo(double preco) {
		preco_global = preco;
	}
}
