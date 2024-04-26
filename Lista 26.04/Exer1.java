package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int opcao;
		String nome;
		Queue<String> clientes = new LinkedList<String>();
		
		do {System.out.println("\n 1 - Adicionar cliente na fila");
		System.out.println(" 2 - Listar todos os clientes");
		System.out.println(" 3 - Retirar cliente da fila");
		System.out.println(" 0 - Sair\n");
		
		System.out.println("*******************************************************\n");
		
		System.out.println("Entre com a opção desejada:");
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		
		case 0:
			System.out.println("Programa finalizado");
			break;
		case 1: 
			System.out.println("Digite o nome:");
			nome = leia.nextLine();
			clientes.add(nome);
			System.out.println("\nFila:\n");
			for (String cliente : clientes ) {
				System.out.println(cliente);
			}
			System.out.println("\nCliente adicionado!");
			break;
			
		case 2: 
			System.out.println("\nLista de Clientes na fila:\n");
			for (String cliente : clientes ) {
				System.out.println(cliente);
			}
			break;
			
		case 3:
			if (clientes.isEmpty()){
				System.out.println("\nA fila está vazia\n");
				} else {
			clientes.poll();
			System.out.println("\nFila:\n");
			for (String cliente : clientes ) {
				System.out.println(cliente);
			}
			System.out.println("\nO cliente foi chamado!");
			} 
			break;
		}
		
		} while (opcao>0);
				
}

}
