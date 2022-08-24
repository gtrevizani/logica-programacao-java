package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e
depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10,
50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar
com a quantidade de notas existentes na máquina.

Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50,
uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50,
quatro notas de 10, uma nota de 5 e quatro notas de 1.
 */
public class EX21Saque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor a ser sacado (entre 10 e 600): ");
        int valorDoSaque = scanner.nextInt();

        if (valorDoSaque < 10 || valorDoSaque > 600) {
            System.out.print("O valor inserido é inválido...");
        } else {
            int centena = valorDoSaque / 100;
            valorDoSaque = (Integer) (valorDoSaque - centena * 100);
            int cinquenta = valorDoSaque / 50;
            valorDoSaque = (Integer) (valorDoSaque - cinquenta * 50);
            int dez = valorDoSaque / 10;
            valorDoSaque = (Integer) (valorDoSaque - dez * 10);
            int cinco = valorDoSaque / 5;
            valorDoSaque = (Integer) (valorDoSaque - cinco * 5);
            int um = valorDoSaque;

            if (centena > 0)
                System.out.print(centena + " nota(s) de cem.\n");
            if (cinquenta > 0)
                System.out.print(cinquenta + " nota(s) de cinquenta.\n");
            if (dez > 0)
                System.out.print(dez + " nota(s) de dez.\n");
            if (cinco > 0)
                System.out.print(cinco + " nota(s) de cinco");
            if (um > 0)
                System.out.print(um + " nota(s) de um.");
        }
        scanner.close();
    }
}
