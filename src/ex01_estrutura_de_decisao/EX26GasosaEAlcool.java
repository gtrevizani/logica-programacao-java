package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;
/*
Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Álcool: até 20 litros, desconto de 3% por litro, acima de 20 litros, desconto de 5% por litro
Gasolina: até 20 litros, desconto de 4% por litro, acima de 20 litros, desconto de 6% por litro.

 Escreva um algoritmo queleia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma:
 A-álcool, G-gasolina),

calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do
litro do álcool é R$ 1,90.
 */
public class EX26GasosaEAlcool {
    static final double PRECO_LITRO_GASOLINA = 2.50;
    static final double PRECO_LITRO_ALCOOL = 1.90;

    static final double DESCONTO_ALCOOL_ATE_20L = 0.3;
    static final double DESCONTO_ALCOOL_ACIMA_20L = 0.5;

    static final double DESCONTO_GASOLINA_ATE_20L = 0.4;
    static final double DESCONTO_GASOLINA_ACIMA_20L = 0.6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A - Álcool;");
        System.out.println("G - Gasolina");
        System.out.print("Escolha o tipo de combustível [A/G]: ");
        char tipoCombustivel = scanner.next().charAt(0);
        System.out.print("Informe a quantidade de litros de combustível: ");
        double quantidadeLitrosDeCombustivel = scanner.nextDouble();

        if (tipoCombustivel == 'A') {
            if(quantidadeLitrosDeCombustivel <= 20){
                double preçoInicial = quantidadeLitrosDeCombustivel * PRECO_LITRO_ALCOOL;
                double preçoFinal = preçoInicial - (preçoInicial * DESCONTO_ALCOOL_ATE_20L / 100);
                System.out.print("Preço com desconto: R$" + preçoFinal);
            } else if (quantidadeLitrosDeCombustivel > 20){
                double preçoInicial = quantidadeLitrosDeCombustivel * PRECO_LITRO_ALCOOL;
                double preçoFinal = preçoInicial - (preçoInicial * DESCONTO_ALCOOL_ACIMA_20L / 100);
                System.out.println("Preço com desconto: R$" + preçoFinal);
            }
        } if (tipoCombustivel == 'G'){
            if(quantidadeLitrosDeCombustivel <= 20){
                double preçoInicial = quantidadeLitrosDeCombustivel * PRECO_LITRO_GASOLINA;
                double preçoFinal = preçoInicial - (preçoInicial * DESCONTO_GASOLINA_ATE_20L / 100);
                System.out.println("Preço com desconto: R$" + preçoFinal);
            } else if(quantidadeLitrosDeCombustivel > 20){
                double preçoInicial = quantidadeLitrosDeCombustivel * PRECO_LITRO_GASOLINA;
                double preçoFinal = preçoInicial - (preçoInicial * DESCONTO_GASOLINA_ACIMA_20L / 100);
                System.out.println("Preço com desconto: R$" + preçoFinal);
            }
        }
        scanner.close();
    }
}
