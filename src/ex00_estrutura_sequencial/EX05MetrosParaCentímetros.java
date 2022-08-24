package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

// Faça um programa que converta metros para centímetros.
public class EX05MetrosParaCentímetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe quantos metros: ");
        Double metros = scanner.nextDouble();

        Double centimetros = obterCentimetros(metros);

        System.out.println(metros + " metro(s) e igual a " + centimetros + " centimetro(s).");
        scanner.close();
    }

    private static double obterCentimetros(Double metros) {
        return metros * 100;
    }
}
