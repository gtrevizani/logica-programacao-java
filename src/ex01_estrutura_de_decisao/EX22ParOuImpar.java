package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;
/*
Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
Dica: utilize o operador módulo (resto da divisão).
 */
public class EX22ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.print("O numero " + numero + " é par.");
        } else {
            System.out.print("O numero " + numero + " é impar.");
        }
        scanner.close();
    }
}
