package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
sabendo que a decisão é sempre pelo mais barato.
 */
public class EX08PreferenciaPeloMaisBarato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcoesDeProdutos = 4;
        int[] precoDosProdutos = new int[opcoesDeProdutos];

        for (int c = 1; c < 4; c++) {
            System.out.print("Insira o preco do " + c + "° produto: ");
            precoDosProdutos[c] = scanner.nextInt();
            while (precoDosProdutos[c] < 0) {
                System.out.println("Valor inválido.");
                System.out.print("Insira o preco do " + c + "° produto: ");
                precoDosProdutos[c] = scanner.nextInt();
            }
        }

        int menorPreco = precoDosProdutos[1];

        for (int c = 1; c < 4; c++) {
            if (menorPreco > precoDosProdutos[c]) {
                menorPreco = precoDosProdutos[c];
            }
        }
        System.out.println(" ");
        System.out.println("O produto mais em conta custa R$" + menorPreco + " reais");
        scanner.close();
    }
}
