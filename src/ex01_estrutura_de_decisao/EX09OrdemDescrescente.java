package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */
public class EX09OrdemDescrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int espacoNoVetor = 4;
        int[] numeros = new int[espacoNoVetor];

        for (int contador = 1; contador < 4; contador++) {
            System.out.print("Informe o " + contador + "° valor: ");
            numeros[contador] = scanner.nextInt();
        }
        for (int contador = 3; contador >= 1; contador--) {
            System.out.println(" ");
            System.out.print(numeros[contador]);
        }
        scanner.close();
    }
}
