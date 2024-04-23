package exercicios;

import java.util.Scanner;

public class ListaProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner leia = new Scanner(System.in);
       
       int opcao, quantidade;
       float valor1, valor2, valor3, valor4, valor5, valor6, valorTotal;
       
       valor1 = 10.00f;
       valor2 = 15.00f;
       valor3 = 18.00f;
       valor4 = 12.00f;
       valor5 = 8.00f;
       valor6 = 13.00f;
       
       System.out.println("Selecione uma opção:");
       System.out.println("*** 1 - Cachorro Quente - R$10.00 ***");
       System.out.println("*** 2 - X-Salada - R$15.00 ***");
       System.out.println("*** 3 - X-Bacon - R$18.00 ***");
       System.out.println("*** 4 - Bauru - R$12.00 ***");
       System.out.println("*** 5 - Refrigerante - R$8.00 ***");
       System.out.println("*** 6 - Suco de laranja - R$13.00 ***");
       
       opcao = leia.nextInt();
       
       System.out.println("Por favor, insira a quantidade do item desejado:");
       quantidade = leia.nextInt();
       
       switch(opcao) {
       case 1: 
       	valorTotal = valor1 * quantidade;
       	System.out.println("Produto: Cachorro Quente");
       	System.out.printf("Valor total: R$%.2f", valorTotal);
       	break;
       	
       case 2: 
          	valorTotal = valor2 * quantidade;
          	System.out.println("Produto: X-Salada");
          	System.out.printf("Valor total: R$%.2f", valorTotal);
          	break;
      
       case 3: 
         	valorTotal = valor3 * quantidade;
         	System.out.println("Produto: X-Bacon");
         	System.out.printf("Valor total: R$%.2f", valorTotal);
         	break;
         	
       case 4: 
         	valorTotal = valor4 * quantidade;
         	System.out.println("Produto: Bauru");
         	System.out.printf("Valor total: R$%.2f", valorTotal);
         	break;
         	
       case 5: 
         	valorTotal = valor5 * quantidade;
         	System.out.println("Produto: Refrigerante");
         	System.out.printf("Valor total: R$%.2f", valorTotal);
         	break;
         	
       case 6: 
         	valorTotal = valor6 * quantidade;
         	System.out.println("Produto: Suco de laranja");
         	System.out.printf("Valor total: R$%.2f", valorTotal);
         	break;
          	
       }
       leia.close();
	}

}
