package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 3 metros quadrados e a tinta é vendida em latas de 18 litros
//que custam R$80,00. Informe ao usuário a quantidade de latas de tinta a serem compradas e o preço total.

public class EX16LojaDeTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho da área a ser decorada (m²): ");
        Double area = scanner.nextDouble();
        System.out.println(" ");

        Double litrosDeTinta = obterLitrosDeTinta(area);
        Double latasGastas = obterLatasGastas(litrosDeTinta);
        Double precoTotal = obterPrecoTotal(latasGastas);

        System.out.println("Latas de tinta a serem compradas: " + latasGastas);
        System.out.println("Preço total: " + precoTotal);
        scanner.close();
    }

    private static double obterLitrosDeTinta(Double area) {
        return Math.ceil(area / 3);
    }

    private static double obterLatasGastas(Double litrosDeTinta) {
        return Math.ceil(litrosDeTinta / 18);
    }

    private static double obterPrecoTotal(Double latasGastas) {
        return Math.ceil(latasGastas * 80);
    }
}
