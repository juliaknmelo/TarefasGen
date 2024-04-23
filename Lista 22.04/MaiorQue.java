package exercicios;

import java.util.Scanner;

public class MaiorQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int a, b, c, x;
	
		
		System.out.println("Digite o primeiro número:");
		a = leia.nextInt();
		System.out.println("Digite o segundo número:");
		b = leia.nextInt();
		System.out.println("Digite o terceiro número:");
		c = leia.nextInt();
		
		x = a+b;
		
		if (x > c) {
			System.out.println("A Soma de A + B é maior do que C");
		} else if (x== c) {
			System.out.println("A Soma de A + B é igual a C");
		}
		else {
			System.out.println("A Soma de A + B é menor do que C");
		}
	}

}
