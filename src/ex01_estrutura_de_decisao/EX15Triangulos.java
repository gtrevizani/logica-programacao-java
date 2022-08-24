package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;

Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;
 */
public class EX15Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int espacos = 3;
        int[] vetor = new int[espacos];

        for (int i = 0; i < 3; i++) {
            System.out.print("Insira o lado de posição " + i + " do triangulo: ");
            vetor[i] = scanner.nextInt();
        }

        if (vetor[0] + vetor[1] > vetor[2] && vetor[0] + vetor[2] > vetor[1] && vetor[1] + vetor[2] > vetor[0]) {
            if (vetor[0] == vetor[1] && vetor[1] == vetor[2]) {
                System.out.println("Eh um triangulo Equilatero");
            } else if (vetor[0] == vetor[1] || vetor[0] == vetor[2] || vetor[1] == vetor[2]) {
                System.out.println("Eh um triangulo Isósceles");
            } else {
                System.out.println("Eh um triangulo Escaleno");
            }
        } else {
            System.out.println("Nao eh um triangulo.");
        }
        scanner.close();
    }
}

