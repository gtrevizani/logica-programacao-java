package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que verifique se uma letra digitada é vogal ou consoante.
public class EX04VogalOuConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vogaisNoVetor = new int[]{'A','a','E','e','I','i','O','o','U','u'};
        int[] consoantesNoVetor = new int[]{'B','b','C','c','D','d','F','f','G','g','T','t','V','v','X','x','Y','y','W','w','Z','z','H','h','J','j','K','k','L','l','M','m','N','n','P','p','Q','q','R','r','S','s'};

        System.out.print("Insira uma letra: ");
        char letra = scanner.nextLine().charAt(0);

        boolean sinal = false;

        for (int i : vogaisNoVetor) {
            if (letra == i) {
                System.out.println("Essa letra é uma vogal.");
                sinal = true;
            }
        }
        for (int y : consoantesNoVetor) {
            if (letra == y) {
                System.out.println("Essa letra é uma consoante.");
                sinal = true;
            }
        }
        if(!sinal){
            System.out.println("Caracetere inválido.");
        }
        scanner.close();
    }
}
