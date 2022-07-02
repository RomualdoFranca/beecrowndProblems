package application;

import entities.Snack;

import java.util.Scanner;
/*  Melhorias a serem implementadas:
    Possibilidade de acrescentar ou alterar produtos
    Realizar vários pedidos
    Customizar os pedidos
    Output com o nome do produto, quantidade e valor total
    Formas de pagamento */
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1- Cachorro Quente R$ 4,00\n" +
                "2- X-Salada R$ 4,50\n" +
                "3- X-Bacon R$ 5,00\n" +
                "4- Torrada Simples R$ 2,00\n" +
                "5- Refrigerante R$ 1,50");
        System.out.println("Digite o código do lanche: ");
        int productCode = sc.nextInt();
        System.out.println("Digite a quantidade do produto: ");
        int quantity = sc.nextInt();
        Snack snack = new Snack(productCode, quantity);
        System.out.printf("Valor total do pedido: R$ %.2f", snack.totalValue());
        sc.close();
    }
}