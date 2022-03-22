package br.com.conta;

import java.util.Scanner;

import dados.GerenciaContasHash;

public class AppContas {
	
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0, numeroConta;
        double limite, valor;

        GerenciaContasHash contas = new GerenciaContasHash();

        while (opcao != 7) {

            System.out.println("1- Nova Conta Corrente");
            System.out.println("2- Nova Conta Especial");
            System.out.println("3- Nova Conta Poupan�a");
            System.out.println("4- Depositar");
            System.out.println("5- Sacar");
            System.out.println("6- Consultar Saldo");
            System.out.println("7- Sair");
            System.out.print("digite numero: ");

            opcao = teclado.nextInt();

            switch (opcao) { 
                case 1:
                    System.out.println("Informe o n�mero da conta Corrente:");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Informe o n�mero da conta Especial:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do limite Conta Especial:");
                    limite = teclado.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;

                case 3:
                    System.out.println("Informe o n�mero da conta Poupanca:");
                    numeroConta = teclado.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Informe o n�mero da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor:");
                    valor = teclado.nextDouble();

                    if (contas.deposito(numeroConta, valor)) {
                        System.out.println("Deposito realizado.");
                    } else {
                        System.out.println("Falha na opera��o.");
                    }
                    break;

                case 5:
                    System.out.println("Informe o n�mero da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor a Sacar:");
                    valor = teclado.nextDouble();

                    if (contas.saque(numeroConta, valor)) {
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Falha na opera��o.");
                    }
                    break;

                case 6:
                    System.out.println("Informe o n�mero da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println(contas.getSaldo(numeroConta));
                    break;

                case 7:
                    break;

                default: 
                    System.out.println("Op��o inv�lida!");
                    break;
            }

        }

        teclado.close();
    }

}
