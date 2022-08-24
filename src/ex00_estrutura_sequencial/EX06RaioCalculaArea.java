package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

// Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
public class EX06RaioCalculaArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double pi = 3.14;

        System.out.print("Informe o raio do circulo: ");
        Double area = scanner.nextDouble();

        Double resultadoArea = obterResultadoArea(pi, area);

        System.out.println("A área do circulo e: " + resultadoArea + ".");
        scanner.close();
    }

    private static double obterResultadoArea(Double pi, Double area) {
        return pi * (area * area);
    }
}
