package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
 */
public class EX17BissextoOuNão {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if (ano % 4 == 0) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano nao é bissexto");
        }
        scanner.close();
    }
}
