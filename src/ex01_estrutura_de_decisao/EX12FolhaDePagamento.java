package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende
do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não
é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa
deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20%

Imprima na tela as informações, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.

        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00

 */
public class EX12FolhaDePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        Double ganhoPorHora = scanner.nextDouble();
        System.out.print("Quantidade de horas trabalhadas no mês: ");
        Double horasTrabalhadasNoMes = scanner.nextDouble();
        System.out.println(" ");

        Double salarioBruto = ganhoPorHora * horasTrabalhadasNoMes;

        if (ganhoPorHora < 0 || horasTrabalhadasNoMes < 0) {
            System.out.println("Valores inválidos.");
        } else if (salarioBruto <= 900) {
            Double impostoDeRenda = (salarioBruto * 0) / 100;
            Double inss = (salarioBruto * 10) / 100;
            Double fgts = (salarioBruto * 11) / 100;
            Double totalDeDescontos = impostoDeRenda + inss;
            Double salarioLiquido = salarioBruto - totalDeDescontos;

            System.out.println("Salario Bruto:          R$" + salarioBruto);
            System.out.println("(-) IR (isento):        R$" + impostoDeRenda);
            System.out.println("(-) INSS (10%):         R$" + inss);
            System.out.println("FGTS (11%):             R$" + fgts);
            System.out.println("----------------------------------");
            System.out.println("Total de descontos:     R$" + totalDeDescontos);
            System.out.println("----------------------------------");
            System.out.println("Salario Liquido:        R$" + salarioLiquido);
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            Double impostoDeRenda = (salarioBruto * 5) / 100;
            Double inss = (salarioBruto * 10) / 100;
            Double fgts = (salarioBruto * 11) / 100;
            Double totalDeDescontos = impostoDeRenda + inss;
            Double salarioLiquido = salarioBruto - totalDeDescontos;

            System.out.println("Salario Bruto:          R$" + salarioBruto);
            System.out.println("(-) IR (5%):            R$" + impostoDeRenda);
            System.out.println("(-) INSS (10%):         R$" + inss);
            System.out.println("FGTS (11%):             R$" + fgts);
            System.out.println("----------------------------------");
            System.out.println("Total de descontos:     R$" + totalDeDescontos);
            System.out.println("----------------------------------");
            System.out.println("Salario Liquido:        R$" + salarioLiquido);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            Double impostoDeRenda = (salarioBruto * 10) / 100;
            Double inss = (salarioBruto * 10) / 100;
            Double fgts = (salarioBruto * 11) / 100;
            Double totalDeDescontos = impostoDeRenda + inss;
            Double salarioLiquido = salarioBruto - totalDeDescontos;

            System.out.println("Salario Bruto:          R$" + salarioBruto);
            System.out.println("(-) IR (10%):           R$" + impostoDeRenda);
            System.out.println("(-) INSS (10%):         R$" + inss);
            System.out.println("FGTS (11%):             R$" + fgts);
            System.out.println("----------------------------------");
            System.out.println("Total de descontos:     R$" + totalDeDescontos);
            System.out.println("----------------------------------");
            System.out.println("Salario Liquido:        R$" + salarioLiquido);
        } else if (salarioBruto > 2500) {
            Double impostoDeRenda = (salarioBruto * 20) / 100;
            Double inss = (salarioBruto * 10) / 100;
            Double fgts = (salarioBruto * 11) / 100;
            Double totalDeDescontos = impostoDeRenda + inss;
            Double salarioLiquido = salarioBruto - totalDeDescontos;

            System.out.println("Salario Bruto:          R$" + salarioBruto);
            System.out.println("(-) IR (isento):        R$" + impostoDeRenda);
            System.out.println("(-) INSS (20%):         R$" + inss);
            System.out.println("FGTS (11%):             R$" + fgts);
            System.out.println("----------------------------------");
            System.out.println("Total de descontos:     R$" + totalDeDescontos);
            System.out.println("----------------------------------");
            System.out.println("Salario Liquido:        R$" + salarioLiquido);
        }
        scanner.close();
    }
}
