package exercicios;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idadeMenor = 0, idadeMaior = 0, idade = 0;
		
		while (idade >=0) {
			
			System.out.println("Digite sua idade:");
			idade = leia.nextInt();
			
			if (idade > 0 && idade <21) {
				idadeMenor++;
			} else if (idade >50) {
				idadeMaior++;
			} 
		}
		
		System.out.println("Idades menor que 21 anos: " +idadeMenor);
		System.out.println("Idades maior que 50 anos: " +idadeMaior);
	}

}
