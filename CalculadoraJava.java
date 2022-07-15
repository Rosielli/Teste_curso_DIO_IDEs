package DIO.ME;

import java.util.Scanner;

public class CalculadoraJava {

     public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = entrada.nextDouble();
		System.out.println("Digite o primeiro valor: ");	    
		b = entrada.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
	}
     
     public static int soma (double a, double b) {
    	 return (int) (a + b);
     }
     public static int subtracao (double a, double b) {
    	 return (int) (a - b);
     }
     public static double divisao (double a, double b) {
    	 return a / b;
     }
     public static int multiplicacao (double a, double b) {
    	 return (int) (a * b);
     }
}
