package exercicios;

import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean doacao;

		System.out.println("Por favor, digite seu nome e sobrenome:");
		nome = leia.nextLine();

		System.out.println("Por favor, digite sua idade:");
		idade = leia.nextInt();

		System.out.println("É sua primeira doação de sangue? (True ou False)");
		doacao = leia.nextBoolean();

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69) {
				if (doacao == false) {
					System.out.println(nome + " está apto para doar sangue.");
				}
				else {
					System.out.println(nome + " não está apto para doar sangue.");
				}
			} else {
				System.out.println(nome + " está apto para doar sangue.");
			}
		} else {
			System.out.println(nome + " não está apto para doar sangue.");
		}

	}
}