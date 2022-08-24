package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

public class EX11NumeroInteiroEReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o 1° número (inteiro): ");
        Double inteiroUm = scanner.nextDouble();
        System.out.print("Insira o 2° numero (inteiro): ");
        Double inteiroDois = scanner.nextDouble();
        System.out.print("Insira o 3° numero (real): ");
        Double realUm = scanner.nextDouble();
        System.out.println(" ");
        Double resultaA = obterResultaA(inteiroUm, inteiroDois);
        Double resultaB = obterResultaB(inteiroUm, realUm);
        Double resultaC = obterResultaC(realUm);

        System.out.println("O produto do dobro do 1° com metade do 2° e: " + resultaA);
        System.out.println("A soma do triplo do 1° com o 3° e: " + resultaB);
        System.out.println("O 3° elevado ao cubo e: " + resultaC);
        scanner.close();
    }

    private static double obterResultaA(Double inteiroUm, Double inteiroDois) {
        return (inteiroUm * 2) * (inteiroDois / 2);

    }

    private static double obterResultaB(Double inteiroUm, Double realUm) {
        return (inteiroUm * 3) + realUm;
    }

    private static double obterResultaC(Double realUm) {
        return realUm * realUm * realUm;
    }
}
