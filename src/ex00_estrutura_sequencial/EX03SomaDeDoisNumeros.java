package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

// Faça um programa que peça dois números e imprima a soma.
public class EX03SomaDeDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe  o 1° numero: ");
        Integer numeroUm = scanner.nextInt();
        System.out.print("Informe o 2° numero: ");
        Integer numeroDois = scanner.nextInt();

        Integer soma = obterSoma(numeroUm, numeroDois);

        System.out.println("A soma de " + numeroUm + " + " + numeroDois + " e igual a: " + soma);
        scanner.close();
    }

    private static int obterSoma(Integer numeroUm, Integer numeroDois) {
        return numeroUm + numeroDois;
    }
}
