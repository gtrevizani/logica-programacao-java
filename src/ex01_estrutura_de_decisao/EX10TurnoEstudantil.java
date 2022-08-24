package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */
public class EX10TurnoEstudantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("M - Matutino");
        System.out.println("V - Vespertino;");
        System.out.println("N - Noturno;");
        System.out.print("Em que turno voce estuda? ");
        char periodoEstudantil = scanner.next().charAt(0);

        switch (periodoEstudantil) {
            default -> System.out.println("Valor Invalido.");
            case 'N' -> System.out.println("Boa noite!");
            case 'V' -> System.out.println("Boa tarde!");
            case 'M' -> System.out.println("Bom dia!");
        }
        scanner.close();
    }
}
