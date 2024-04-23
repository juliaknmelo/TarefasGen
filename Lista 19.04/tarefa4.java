package tarefa4;

import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);	
		
		float n1;
		float n2;
		float n3;
		float n4;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro valor: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto valor: ");
		n4 = leia.nextFloat();
				
		float diferenca = (n1*n2) - (n3*n4);
		
		System.out.println("Seu resultado é: " + diferenca);
		
		float num1;
		float num2;
		float num3;
		float num4;
		
		System.out.println("       ");
		
		System.out.println("Digite o primeiro valor: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		num2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro valor: ");
		num3 = leia.nextFloat();
		
		System.out.println("Digite o quarto valor: ");
		num4 = leia.nextFloat();
		
		float diferenca2 = (num1*num2) - (num3*num4);
		
		System.out.println("Seu novo resultado é: " + diferenca2);
		
	
		
	}

}
