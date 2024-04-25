package exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();

		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Digite um número inteiro sem repetir");
			numeros.add(leia.nextInt());

		}

		System.out.println("\nLista de números\n");

		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
	}

}
