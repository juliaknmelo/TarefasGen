package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilhaLivros = new Stack<String>();
		int opcao;
		String livro;
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("\n******************************\n");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair\n");
			System.out.println("******************************\n");
			
			System.out.println("Digite uma opção:");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch(opcao) {
			
			case 0:
				System.out.println("Programa finalizado");
				break;
			case 1:
				System.out.println("Digite o nome do livro:");
				livro = leia.nextLine();
				pilhaLivros.push(livro);
				System.out.println("\nPilha:\n");
				for (String livros : pilhaLivros) {
					System.out.println(livros);
				}
				System.out.println("\nLivro adicionado!\n");
				break;
				
			case 2:
				System.out.println("\nLista de livros na pilha\n");
				for (String livros : pilhaLivros) {
					System.out.println(livros);
				}
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia");
				} else {
				pilhaLivros.pop();
				System.out.println("\nPilha\n");
				for (String livros : pilhaLivros) {
					System.out.println(livros);
				}
				System.out.println("\nUm livro foi retirado da pilha");
				}
				break;
				
			}

			
		}while (opcao !=0);
	
	}

}
