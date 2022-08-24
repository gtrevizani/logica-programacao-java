package cad01_estrutura_sequencial.src.ListaDeExercicios;
// Faça um programa que peça as 4 notas bimestrais e mostre a média

import java.util.Scanner;

public class EX04MediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a 1° nota: ");
        Double notaUm = scanner.nextDouble();
        System.out.print("Informe a 2° nota: ");
        Double notaDois = scanner.nextDouble();
        System.out.print("Informe a 3° nota: ");
        Double notaTres = scanner.nextDouble();
        System.out.print("Informe a 4° nota: ");
        Double notaQuatro = scanner.nextDouble();

        Double media = obterMedia(notaUm, notaDois, notaTres, notaQuatro);

        System.out.println("A média e: " + media);
        scanner.close();
    }

    private static double obterMedia(Double notaUm, Double notaDois, Double notaTres, Double notaQuatro) {
        return (notaUm + notaDois + notaTres + notaQuatro) / 4;
    }

}
