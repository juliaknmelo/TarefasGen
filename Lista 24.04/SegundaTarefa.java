package exercicios;

public class SegundaTarefa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros [] [] = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		int somaDiagPrin =0;
		int somaDiagSec = 0;
		
		for (int indLinha = 0; indLinha <numeros.length; indLinha++) {
			
			for (int indColuna = 0; indColuna <numeros.length; indColuna++) {
				System.out.println(numeros [indLinha][indColuna]);
			}
			
			System.out.println();
			
		}
		System.out.println("Elementos da diagonal principal");
		
		for (int contador=0; contador < numeros.length; contador++) {
			System.out.println(numeros [contador][contador] + " ");
			somaDiagPrin = somaDiagPrin + numeros [contador][contador];
		}
		
		System.out.println("\nSoma de todos os elementos da Diagonal Principal: " + somaDiagPrin);
		
		System.out.println("\nElementos da Diagonal Secundária:");
		for (int contador=0; contador < 3; contador++) {
			System.out.println(numeros [contador][2 - contador]);
			somaDiagSec = somaDiagSec + numeros [contador][2 - contador];
		}
		
		System.out.println("\nSoma de todos os elementos da Diagonal Secundária: " + somaDiagSec);
	}

}
