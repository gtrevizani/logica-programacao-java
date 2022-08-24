package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;
//Faça um programa que pergunte quanto você ganha por hora e o número de horas
//trabalhadas no mês. Calcule e mostre o total do seu salário no referido
//mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS
//e 5% para o sindicato, faça um programa que nos dê:
//
//a) Salário bruto;
//b) quanto pagou ao INSS;
//c) quanto pagou ao sindicado;
//d) o salário líquido;
//e) calcule os descontos e o salário líquido, conforme abaixo:
//      + Salário Bruto: R$
//      - IR (11%): R$
//      - INSS (8%): R$
//      - Sindicato (5%): R$
//      - Salário Liquido: R$

public class EX15GanhoPorHoraEHorasMensal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        Double dinheiroPorHora = scanner.nextDouble();
        System.out.print("Número de horas trabalhadas no mês: ");
        Double horasNoMes = scanner.nextDouble();
        System.out.println(" ");

        Double salarioBruto = obterSalarioNoMes(dinheiroPorHora, horasNoMes);
        Double descontoIR = (salarioBruto * 11)/100;
        Double descontoINSS = (salarioBruto * 8)/100;
        Double descontoSIND = (salarioBruto * 5)/100;
        Double salarioLiquido = salarioBruto - descontoINSS - descontoIR - descontoSIND;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("IR (11%): R$ " + descontoIR);
        System.out.println("INSS (8%): R$ " + descontoINSS);
        System.out.println("Sindicato (5%): R$ " + descontoSIND);
        System.out.println("Salário Liquido: R$ " + salarioLiquido);
        scanner.close();
    }

    private static double obterSalarioNoMes(Double dinheiroPorHora, Double horasNoMes) {
        return dinheiroPorHora * horasNoMes;
    }
}
