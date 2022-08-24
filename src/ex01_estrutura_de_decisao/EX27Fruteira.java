package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                      Até 5 Kg           Acima de 5 Kg
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto
de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças
adquiridas e escreva o valor a ser pago pelo cliente.
 */
public class EX27Fruteira {
    static final double PRECO_DO_MORANGO_ATE_5KG = 2.50;
    static final double PRECO_DA_MACA_ATE_5KG = 1.80;
    static final double PRECO_DO_MORANGO_ACIMA_5KG = 2.20;
    static final double PRECO_DA_MACA_ACIMA_5KG = 1.50;
    static final double DESCONTO_ACIMA_8KG_OU_25_REAIS = 1.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos Kg de morangos você deseja: ");
        double quantidadeMorango = scanner.nextDouble();
        System.out.print("Quantos Kg de maças você deseja: ");
        double quantidadeMaca = scanner.nextDouble();


        double precoMorango = 0;
        double precoMaca = 0;

        if (quantidadeMorango <= 5) {
            precoMorango = quantidadeMorango * PRECO_DO_MORANGO_ATE_5KG;
        } else if (quantidadeMorango > 5) {
            precoMorango = quantidadeMorango * PRECO_DO_MORANGO_ACIMA_5KG;
        }
        if (quantidadeMaca <= 5) {
            precoMaca = quantidadeMaca * PRECO_DA_MACA_ATE_5KG;
        } else if (quantidadeMaca > 5) {
            precoMaca = quantidadeMaca * PRECO_DA_MACA_ACIMA_5KG;
        }

        boolean acimaDe8KG = quantidadeMaca + quantidadeMorango >= 8;
        boolean acimaDe25Reais = precoMorango + precoMaca >= 25;

        if (acimaDe8KG || acimaDe25Reais) {
            double precoInicial = precoMorango + precoMaca;
            double precoFinal = precoInicial - (precoInicial * DESCONTO_ACIMA_8KG_OU_25_REAIS / 100);
            System.out.println("O preço final da compra foi R$" + precoFinal);
        } else {
            double precoFinal = precoMorango + precoMaca;
            System.out.println("O preço final da compra foi R$" + precoFinal);
        }
        scanner.close();
    }
}
