package cad01_estrutura_sequencial.src.ListaDeExercicios;
//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 6 metros quadrados e a tinta é vendida em latas de 18 litros
//que custam R$80,00 ou em galões de 3,6 litros que custam R$25,00.
//
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//
//a) comprar apenas latas de 18 litros;
//b) comprar apenas galões de 3,6 litros;
//c) misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga
//e sempre arredonde os valores para cima, isto é, considere latas cheias.

import java.util.Scanner;

public class EX17LojaDeTintasParteDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cobertura_em_metros_de_um_litro_de_tinta = 6;
        double quantidade_de_litros_na_lata = 18;
        double preco_da_lata_de_tinta = 80;
        double rendimento_da_lata = cobertura_em_metros_de_um_litro_de_tinta * quantidade_de_litros_na_lata;
        double quantidade_de_litros_no_galao = 3.6;
        double preco_do_galao_de_tinta = 25;
        double rendimento_do_galao = cobertura_em_metros_de_um_litro_de_tinta * quantidade_de_litros_no_galao;

        System.out.print("Tamanho da área a ser decorada (m²): ");
        Double area = scanner.nextDouble();
        System.out.println(" ");

        Double quantidade_de_latas = Math.ceil(area/rendimento_da_lata);
        Double preco_total_latas = quantidade_de_latas * preco_da_lata_de_tinta;
        Double quantidade_de_galoes = Math.ceil(area/rendimento_do_galao);
        Double preco_total_galoes = quantidade_de_galoes * preco_do_galao_de_tinta;

        Double latas_gastas = Math.floor(area / rendimento_da_lata);
        Double galoes_gastos = Math.floor(area / rendimento_do_galao);
        Double misturados = (latas_gastas * preco_da_lata_de_tinta) + (galoes_gastos * preco_do_galao_de_tinta);
        Double misturados_com_folga = misturados - (misturados * 10) / 100;

        System.out.println("Latas de tinta de 18 litros a serem compradas: " + quantidade_de_latas);
        System.out.println("Preço total com latas de 18 litros: " + preco_total_latas);
        System.out.println("Galão de tinta de 3,6 litros a serem compradas: " + quantidade_de_galoes);
        System.out.println("Preço total com galões de 3,6 litros: " + preco_total_galoes);
        System.out.println("Latas gastas: " + latas_gastas + " / Galões gastos: " + galoes_gastos);
        System.out.println("Preço misturado e com 10% de folga: " + misturados_com_folga);
        scanner.close();
    }
}