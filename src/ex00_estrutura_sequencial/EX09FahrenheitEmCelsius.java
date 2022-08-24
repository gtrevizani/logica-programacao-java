package cad01_estrutura_sequencial.src.ListaDeExercicios;
// Faça um programa que peça a temperatura em graus Fahrenheit,
// transforme e mostre a temperatura em graus Celsius.

import java.util.Scanner;

public class EX09FahrenheitEmCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a temperatura (F°): ");
        Double Fahrenheit = scanner.nextDouble();

        Double Celsius = obterCelsius(Fahrenheit);

        System.out.println("A temperatura " + Fahrenheit + " em Celsius e: " + Celsius);
        scanner.close();
    }

    private static double obterCelsius(Double Fahrenheit) {
        return 5 * ((Fahrenheit - 32) / 9);
    }
}
