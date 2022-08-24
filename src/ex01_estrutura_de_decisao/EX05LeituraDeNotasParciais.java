package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a
//média alcançada por aluno e apresentar:
//
//a) A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//b) A mensagem "Reprovado", se a média for menor do que sete;
//c) A mensagem "Aprovado com Disntinção", se a média for igual a dez.
public class EX05LeituraDeNotasParciais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        double notaUm = scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double notaDois = scanner.nextDouble();
        System.out.println(" ");

        if (notaUm < 0 || notaDois < 0 || notaUm > 10 || notaDois > 10) {
            System.out.println("Nota(s) inválida(s).");
        } else {
            double media = obterMedia(notaUm, notaDois);
            if (media == 10) {
                System.out.println("Média: " + media);
                System.out.println("Aprovado com Distinção.");
            } else if (media >= 7) {
                System.out.println("Média: " + media);
                System.out.println("Aprovado.");
            } else if (media < 7) {
                System.out.println("Média: " + media);
                System.out.println("Reprovado.");
            }
        }
        scanner.close();
    }

    private static double obterMedia(Double notaUm, Double notaDois) {
        return (notaUm + notaDois) / 2;
    }
}
