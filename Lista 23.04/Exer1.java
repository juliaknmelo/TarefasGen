package exercicios;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número:");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número:");
		numero2 = leia.nextInt();
		
		int i;
		
		if (numero1 < numero2) {
			for (i = numero1; i <= numero2; i++) {
				if (i%3==0 && i%5==0) {
					System.out.println(i + " é multiplo de 3 e 5");
				}
			}
			
		} else {
			System.out.println("Intervalo inválido");
		}
		
	}

}
