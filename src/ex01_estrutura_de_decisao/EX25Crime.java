package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;
/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

 */
public class EX25Crime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Você telefonou para a vítima? S/N: ");
        char primeiraPergunta = scanner.next().charAt(0);
        System.out.print("Você esteve no local do crime? S/N: ");
        char segundoPergunta = scanner.next().charAt(0);
        System.out.print("Você mora perto da vítima? S/N: ");
        char terceiraPergunta = scanner.next().charAt(0);
        System.out.print("Você devia para a vítima? S/N: ");
        char quartaPergunta = scanner.next().charAt(0);
        System.out.print("Você já trabalhou com a vítima? S/N: ");
        char quintaPergunta = scanner.next().charAt(0);

        int taxaDeRespostas = 0;

        if (primeiraPergunta == 'S') {
            taxaDeRespostas += 1;
        }if (segundoPergunta == 'S') {
            taxaDeRespostas += 1;
        } if (terceiraPergunta == 'S') {
            taxaDeRespostas += 1;
        } if (quartaPergunta == 'S') {
            taxaDeRespostas += 1;
        } if (quintaPergunta == 'S') {
            taxaDeRespostas += 1;
        }

        if (taxaDeRespostas == 5) {
            System.out.println(" ");
            System.out.print("Você é o assasino!");
        }
        else if (taxaDeRespostas == 3 || taxaDeRespostas == 4) {
            System.out.println(" ");
            System.out.print("Você é cumplice do assasinato!");
        }
        else if (taxaDeRespostas == 2) {
            System.out.println(" ");
            System.out.print("Você é um possível suspeito!");
        }
        else{
            System.out.println(" ");
            System.out.println("Você esta liberado, inocente.");
        }
        scanner.close();
    }
}
