package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        int opStart = 0;

        do {
            Conta conta;
            System.out.println("Deseja iniciar o programa?");
            System.out.println();
            System.out.print("Escolha a opção, digite 1 para entrar no sistema ou 0 para sair: ");
            opStart = sc.nextInt();


            if (opStart == 1) {
                System.out.print("Entre com o numero da conta: ");
                int numero = sc.nextInt();
                System.out.print("Entre com o nome: ");
                sc.nextLine();
                String nome = sc.nextLine();


                if (opcao == 1) {
                    conta = new Conta(numero, nome);
                } else {
                    conta = new Conta(numero, nome);
                }
                System.out.println();
                System.out.println("Dados da conta:");
                System.out.println(conta);

                System.out.println();
                System.out.print("Entre com o valor do deposito: ");
                double depositarValor = sc.nextDouble();
                conta.depositar(depositarValor);
                System.out.println();
                System.out.println("Valor atualizado para " + conta);


                System.out.println("Deseja efetuar um saque? Digite 1 para Sim ou 0 para Não ");
                System.out.println();
                System.out.print("Digite a opção desejada: ");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.print("Digite o valor a ser retirado: ");
                    double sacarValor = sc.nextDouble();
                    conta.sacar(sacarValor);
                    System.out.print("Saldo atualizado para: " + conta);
                    System.out.println();
                } else {
                    conta = new Conta(numero, nome, conta.getSaldo());
                    System.out.println(conta);
                }
            } else {
                System.exit(0);
            }
        } while (opStart == 1);
        sc.close();
    }
}
