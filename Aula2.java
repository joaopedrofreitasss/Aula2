package Aula2;

import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //bem vindo
        int opcao;

        do {
            System.out.println("\nbem vindo à loja de plantas da Dona Gabrielinha");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    System.out.println("Obrigada por usar a calculadora! Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();  
    }

    public static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("Digite a quantidade de plantas vendidas: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        System.out.printf("O preço total da venda é: R$ %.2f%n", precoTotal);
    }

    public static void calcularTroco(Scanner scanner) {
        System.out.print("Digite o valor pago pelo cliente: ");
        double valorPago = scanner.nextDouble();

        System.out.print("Digite o valor total da compra: ");
        double valorTotal = scanner.nextDouble();

        if (valorPago < valorTotal) {
            System.out.println("O valor pago é insuficiente!");
        } else {
            double troco = valorPago - valorTotal;
            System.out.printf("O troco a ser dado é: R$ %.2f%n", troco);
        }
    }
}
