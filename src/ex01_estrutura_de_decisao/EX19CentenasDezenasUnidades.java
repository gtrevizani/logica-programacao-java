package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas
e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:

326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21,
11, 1, 7 e 16
 */
public class EX19CentenasDezenasUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        Integer numeroInteiro = scanner.nextInt();

        if (numeroInteiro >= 1000 || numeroInteiro < 0) {
            System.out.println("Numero inválido");
        } else {
            Integer unidade = numeroInteiro % 10;
            numeroInteiro = (numeroInteiro - unidade) / 10;
            Integer dezena = numeroInteiro % 10;
            numeroInteiro = (numeroInteiro - dezena) / 10;
            Integer centena = numeroInteiro;

            System.out.println(centena + " centena(s), " + dezena + " dezena(s) e " + unidade + " unidade(s).");

        }
        scanner.close();
    }
}
