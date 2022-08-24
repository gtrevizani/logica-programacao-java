package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

//João comprou um PC para controle de rendimento diário do seu trabalho.
//Toda vez que traz um peso de peixes maior que o estabelecido  (50 kg),
//deve pagar uma multa de R$4,00 por quilo excedente.
//
//João precisa que você faça um programa que leia a var peso (peso de peixes)
//e calcule o excesso. Gravar na var excesso a quantidade de kg além do limite
//e na var multa o valor da multa que o João deverá pagar. Imprima os dados
//do programa com as mensagens adequadas.
public class EX14CalculoDeExcesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de peixes (kg): ");
        Double peso = scanner.nextDouble();

        Double excesso = obterExcesso(peso);
        Double multa = obterMulta(excesso);

        System.out.println("Quantidade em excesso (kg): " + excesso);
        System.out.println("Multa a pagar: " + multa);
        scanner.close();
    }

    private static double obterExcesso(Double peso) {
        return peso - 50;
    }

    private static double obterMulta(Double excesso) {
        return excesso * 4;
    }
}
