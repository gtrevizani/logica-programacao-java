package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

// Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário
public class EX07AreaDoQuadradoMostraDobro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o lado do quadrado: ");
        Double area = scanner.nextDouble();

        Double areaTotal = obterAreaTotal(area);
        Double dobroAreaTotal = obterDobroAreaTotal(areaTotal);

        System.out.println("A área do quadrado é: " + areaTotal);
        System.out.println("O dobro da área do quadrado é: " + dobroAreaTotal);
        scanner.close();
    }

    private static double obterDobroAreaTotal(Double areaTotal) {
        return areaTotal * 2;
    }

    private static double obterAreaTotal(Double area) {
        return area * area;
    }
}
