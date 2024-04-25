package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> listaDeCores = new ArrayList<String>();
		String cor;
		
		
		
		for(int contador =0; contador <5; contador++) {
			System.out.println("Digite a cor:");
			cor = leia.nextLine();
			
			listaDeCores.add(cor);
			
		}
		
		System.out.println("\nLista de todas as cores: ");
		
		for (String cores : listaDeCores) {
			System.out.println(cores);
		}
		
		listaDeCores.sort(null);
		System.out.println("\nCores ordenadas: ");
		
		for (String cores : listaDeCores) {
			System.out.println(cores);
		}
		
	
		}

}
