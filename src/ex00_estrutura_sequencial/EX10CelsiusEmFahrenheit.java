package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

// Faça um programa que peça a temperatura em graus Celsius,
// transforme e mostre em graus Fahrenheit.
public class EX10CelsiusEmFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a temperatura (C°): ");
        Double Celsius = scanner.nextDouble();

        Double Fahrenheit = obterFahrenheit(Celsius);

        System.out.println("A temperatura " + Celsius + " em Fahrenheit e: " + Fahrenheit);
        scanner.close();
    }

    private static double obterFahrenheit(Double Celsius) {
        return Celsius * 1.8 + 32;
    }
}
