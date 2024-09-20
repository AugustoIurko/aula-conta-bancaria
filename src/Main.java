import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        String nome = "Augusto";
        String tipoConta = "Corrente";
        double saldo = 1600;
        int opcao = 0;

        System.out.println("*****************************************");
        System.out.println(" nome do cliente: " + nome);
        System.out.println(" tipo conta: " + tipoConta);
        System.out.println(" saldo atual: " + saldo);
        System.out.println("*****************************************");

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("Digite opção desejada");
            System.out.println(" 1 - Consultar saldo");
            System.out.println(" 2 - Transferência de valores");
            System.out.println(" 3 - Receber valor");
            System.out.println(" 4 - Sair");

            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida");
            }
        }

        leitura.close();
    }
}
