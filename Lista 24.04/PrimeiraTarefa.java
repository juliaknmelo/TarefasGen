package exercicios;

import java.util.Scanner;

public class PrimeiraTarefa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int numeros[] = new int[10];
		int valorInserido, contador;
		boolean condicao = false;
		

		for (contador = 0; contador < numeros.length; contador++) {
			System.out.println("Digite um número:");
			numeros[contador] = leia.nextInt();
		}

		System.out.println("Digite o número que você deseja encontrar:");
		valorInserido = leia.nextInt();

		for (contador = 0; contador < numeros.length; contador++) {

			if (valorInserido == numeros[contador]) {
				System.out.println("O número " + valorInserido + " está localizado na posição " + contador);
			 condicao = true;
			 break;
			} 
			
		}
		if (condicao == false)
			System.out.println("O número " + valorInserido + " não foi encontrado");
	}

}
