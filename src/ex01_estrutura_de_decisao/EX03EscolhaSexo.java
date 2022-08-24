package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculinio, Sexo Inválido.
public class EX03EscolhaSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma opção (F ou M): ");
        char sexo = scanner.nextLine().charAt(0);

        boolean sexoMasculino = sexo == 'M' || sexo == 'm';
        boolean sexoFeminino = sexo == 'F' || sexo == 'f';
        boolean sexoMasculinoOuFeminino = sexoFeminino || sexoMasculino;

        if (!sexoMasculinoOuFeminino) {
            System.out.println("Sexo inválido");
        } else {
            if (sexoFeminino) {
                System.out.println("Feminino.");
            }
            if (sexoMasculino) {
                System.out.println("Masculino.");
            }
        }
        scanner.close();
    }
}
