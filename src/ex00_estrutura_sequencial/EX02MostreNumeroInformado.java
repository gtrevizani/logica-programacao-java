package cad01_estrutura_sequencial.src.ListaDeExercicios;
// Faça um programa que peça um número e então mostre a mensagem O número informado foi [número]

import java.util.Scanner;

public class EX02MostreNumeroInformado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um scanner: ");
        Double informeNumero = scanner.nextDouble();
        System.out.println("O scanner informado foi: " + informeNumero);
        scanner.close();
    }
}
