package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que leia três números e mostre o maior deles.
public class EX06MostreOMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDoVetor = 4;
        int[] numerosNoVetor = new int[quantidadeDoVetor];
        int i, maior;

        for (i = 1; i < 4; i++) {
            System.out.print("Insira o " + i + "° numero: ");
            numerosNoVetor[i] = scanner.nextInt();
        }
        maior = numerosNoVetor[1];
        for (i = 1; i < 4; i++) {
            if (maior < numerosNoVetor[i]) {
                maior = numerosNoVetor[i];
            }
        }
        System.out.println("O maior valor é: " + maior);
        scanner.close();
    }
}
