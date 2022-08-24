package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar
outro valor deve aparecer valor inválido.
 */
public class EX13DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Domingo; \t 4 - Quarta; \t 7 - Sabado");
        System.out.println("2 - Segunda; \t 5 - Quinta;");
        System.out.println("3 - Terca; \t\t 6 - Sexta;");
        System.out.println(" ");
        System.out.print("Informe um numero: ");
        int diaDaSemana = scanner.nextByte();

        switch (diaDaSemana) {
            default -> System.out.println("Valor inválido.");
            case 1 -> System.out.println("Hoje é Domingo.");
            case 2 -> System.out.println("Hoje é Segunda.");
            case 3 -> System.out.println("Hoje é Terca.");
            case 4 -> System.out.println("Hoje é Quarta.");
            case 5 -> System.out.println("Hoje é Quinta.");
            case 6 -> System.out.println("Hoje é Sexta.");
            case 7 -> System.out.println("Hoje é Sabado.");
        }
        scanner.close();
    }
}
