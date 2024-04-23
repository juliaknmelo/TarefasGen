package tarefa2;

import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		System.out.println("Digite sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		float mediaFinal;
		mediaFinal = (nota1+nota2+nota3+nota4)/4;
				
		System.out.printf("Sua média final é = %.1f", mediaFinal);
	}

}
