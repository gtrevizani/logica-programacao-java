package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

public class EX13PesoIdealHomemMulher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        Double altura = scanner.nextDouble();
        System.out.println(" ");

        Double pesoIdealHomem = obterPesoIdealHomem(altura);
        Double pesoIdealMulher = obterPesoIdealMulher(altura);

        System.out.println("Seu peso ideal (HOMEM): " + pesoIdealHomem);
        System.out.println("Seu peso ideal (MULHER): " + pesoIdealMulher);
        scanner.close();
    }

    private static double obterPesoIdealMulher(Double altura) {
        return 62.1 * altura - 44.7;
    }

    private static double obterPesoIdealHomem(Double altura) {
        return (72.7 * altura) - 58;
    }
}
