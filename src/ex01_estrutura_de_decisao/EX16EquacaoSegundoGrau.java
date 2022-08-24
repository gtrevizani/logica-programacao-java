package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os
valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os
demais valores, sendo encerrado;
Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
 */
public class EX16EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o falor de A: ");
        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println("Nao eh uma equacao do segundo grau");
        } else {
            System.out.print("Informe o valor de B: ");
            int b = scanner.nextInt();
            System.out.print("Informe o valor de C: ");
            int c = scanner.nextInt();

            double elevacaoo = Math.pow(b, b);
            double delta = (elevacaoo) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Delta menor que 0. Sem raizes reais.");
            } else if (delta == 0) {
                int raiz = (-b) / (2 * a);
                System.out.println("A raaiz eh: " + raiz);
            } else {
                double elevacao = Math.pow(delta, 0.5);
                double raizUm = (-b + (elevacao)) / (2 * a);
                double raizDois = (-b - (elevacao)) / (2 * a);
                System.out.println("Raiz 1: " + raizUm);
                System.out.println("Raiz 2: " + raizDois);
            }
        }
        scanner.close();
    }
}
