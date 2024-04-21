package tarefa3;

import java.util.Scanner;

public class tarefa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		
		System.out.println("Digite seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite seus descontos salariais: ");
		descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Seu salário liquido é: " + salarioLiquido);
		
		
	}

}
