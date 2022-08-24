package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

public class EX12AlturaPesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        Double altura = scanner.nextDouble();

        Double pesoIdeal = calculaPesoIdeal(altura);

        System.out.println("Seu peso ideal e: " + pesoIdeal);
        scanner.close();
    }

    private static double calculaPesoIdeal(Double altura) {
        return (72.7 * altura) - 58;
    }
}
