package cad01_estrutura_sequencial.src.ListaDeExercicios;
// Faça um programa que pergunte quanto você ganha por hora,
// o número de horas trabalhadas no mês. Calcule e mostre o
// total do seu salário no referido mês.

import java.util.Scanner;

public class EX08TotalSalarioPorMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe remuneração por hora: ");
        Double salarioHora = scanner.nextDouble();
        System.out.print("Informe horas trabalhadas no mês: ");
        Double horasMes = scanner.nextDouble();

        Double salarioMes = obterSalarioMes(salarioHora, horasMes);

        System.out.println("Salário referido no mês: " + salarioMes);
        scanner.close();
    }

    private static double obterSalarioMes(Double salarioHora, Double horasMes) {
        return salarioHora * horasMes;
    }
}
