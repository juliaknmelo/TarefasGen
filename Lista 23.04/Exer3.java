package exercicios;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int numero, total=0;
		
		do {
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			
			if (numero>0) {
				total = total + numero;
			}
			
		} while (numero !=0);
			
		System.out.println("O total da soma dos números positivos é: "+total);
	}

}
