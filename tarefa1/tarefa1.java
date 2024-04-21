package tarefa1;

import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float salario;
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		float abono;
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		System.out.println("Novo salário: " + novoSalario);
		
	}

}
