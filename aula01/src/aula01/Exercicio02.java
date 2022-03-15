package aula01;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salarioBruto, prestacao, limite;
		
		System.out.println("digite o valor do  salario bruto");
		salarioBruto = teclado.nextDouble();
		System.out.println("digite o valor da prestação");
		prestacao = teclado.nextDouble();
		
		limite = salarioBruto * 0.3;
		
		if(prestacao <= limite) {
			System.out.println("Voce pode receber o emprestimo");
			
		}else {
			System.out.println("Voce nao pode receber o emprestimo");
			
		}
		
		teclado.close();
		
	}

}
