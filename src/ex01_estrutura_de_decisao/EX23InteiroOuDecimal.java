package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;
/*
Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
Dica: utilize uma função de arredondamento.
 */
public class EX23InteiroOuDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        double numero = scanner.nextDouble();

        if(numero % 1 == 0) {
            System.out.print("O numero " + numero + " é inteiro.");
        } else {
            System.out.print("O numero " + numero + " é decimal.");
        }
        scanner.close();
    }
}
