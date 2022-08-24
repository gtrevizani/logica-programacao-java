package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o
 programa que calculará os reajustes.
        Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no
        salário atual:
            salários até R$ 280,00 (incluindo) : aumento de 20%
            salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
            salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
            salários de R$ 1500,00 em diante : aumento de 5%
Após o aumento ser realizado, informe na tela:
                o salário antes do reajuste;
                o percentual de aumento aplicado;
                o valor do aumento;
                o novo salário, após o aumento.
 */
public class EX11ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu salario: ");
        double salarioInicial = scanner.nextDouble();

        if (salarioInicial < 0) {
            System.out.println("Salário inválido.");
        } else if (salarioInicial <= 279) {
            double valorDoReajuste = (salarioInicial * 20) / 100;
            double salarioComReajuste = salarioInicial + valorDoReajuste;

            System.out.println("Salario antes do reajuste: " + salarioInicial);
            System.out.println("Percentual de aumento aplicado: 20%");
            System.out.println("O valor do aumento: " + valorDoReajuste);
            System.out.println("Salario com reajuste: " + salarioComReajuste);
        } else if (salarioInicial >= 280 && salarioInicial <= 699) {
            double valorDoReajuste = (salarioInicial * 15) / 100;
            double salarioComReajuste = salarioInicial + valorDoReajuste;

            System.out.println("Salario antes do reajuste: " + salarioInicial);
            System.out.println("Percentual de aumento aplicado: 15%");
            System.out.println("O valor do aumento: " + valorDoReajuste);
            System.out.println("Salario com reajuste: " + salarioComReajuste);
        } else if (salarioInicial >= 700 && salarioInicial <= 1499) {
            double valorDoReajuste = (salarioInicial * 10) / 100;
            double salarioComReajuste = salarioInicial + valorDoReajuste;

            System.out.println("Salario antes do reajuste: " + salarioInicial);
            System.out.println("Percentual de aumento aplicado: 10%");
            System.out.println("O valor do aumento: " + valorDoReajuste);
            System.out.println("Salario com reajuste: " + salarioComReajuste);
        } else if (salarioInicial >= 1500) {
            double valorDoReajuste = (salarioInicial * 5) / 100;
            double salarioComReajuste = salarioInicial + valorDoReajuste;

            System.out.println("Salario antes do reajuste: " + salarioInicial);
            System.out.println("Percentual de aumento aplicado: 5%");
            System.out.println("O valor do aumento: " + valorDoReajuste);
            System.out.println("Salario com reajuste: " + salarioComReajuste);
        }
        scanner.close();
    }
}
