package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
 */
public class EX18DataValidaOuNao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um dia: ");
        byte dia = scanner.nextByte();
        System.out.print("Digite um mês: ");
        byte mes = scanner.nextByte();
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean dataValida = false;
        boolean bissextoValida = false;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia <= 31) {
                dataValida = true;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 | mes == 11) {
            if (dia <= 30) {
                dataValida = true;
            }
        } else if (mes == 2) {
            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                if (dia <= 29) {
                    bissextoValida = true;
                } else if (dia <= 28) {
                    bissextoValida = true;
                }
            }
        }
        if (dataValida == true || bissextoValida) {
            System.out.print("A data inserida é válida");
        } else {
            System.out.print("A data inserida não é válida");
        }
        scanner.close();
    }
}
