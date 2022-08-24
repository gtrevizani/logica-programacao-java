package cad02_estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                      Até 5 Kg           Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente.

 Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra.
 Escreva um programa que peça o tipo e a quantidade de carne comprada pelo
usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de
pagamento, valor do desconto e valor a pagar.
 */
public class EX28Hipermercado {
    static final double PRECO_DO_FILE_DUPLO_ATE_5KG = 4.90;
    static final double PRECO_DO_FILE_DUPLO_ACIMA_DE_5KG = 5.80;
    static final double PRECO_DA_ALCATRA_ATE_5KG = 5.90;
    static final double PRECO_DA_ALCATRA_ACIMA_DE_5KG = 6.80;
    static final double PRECO_DA_PICANHA_ATE_5KG = 6.90;
    static final double PRECO_DA_PICANHA_ACIMA_DE_5KG = 7.80;
    static final double DESCONTO_CARTAO_TABAJARA = 0.05;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(1) file duplo\n(2) alcatra\n(3)picanha\nEscolha sua carne: ");
        int opcaoDeCarne = scanner.nextByte();
        System.out.print("Digite a quantidade desejada(Kg): ");
        int quantidadeCarne = scanner.nextInt();
        System.out.print("A compra sera feita via cartao tabajara (1)sim (2)nao: ");
        byte cartao = scanner.nextByte();

        double precoInicial = 0;
        double desconto = 0;
        String aviso = null;
        String tipoDeCarne = null;

        if (opcaoDeCarne == 1 && quantidadeCarne <= 5) {
            precoInicial = quantidadeCarne * PRECO_DO_FILE_DUPLO_ATE_5KG;
            tipoDeCarne = "Filé Duplo";
        } else if (opcaoDeCarne == 1 && quantidadeCarne > 5) {
            precoInicial = quantidadeCarne * PRECO_DO_FILE_DUPLO_ACIMA_DE_5KG;
            tipoDeCarne = "Filé Duplo";
        }
        if (opcaoDeCarne == 2 && quantidadeCarne <= 5) {
            precoInicial = quantidadeCarne * PRECO_DA_ALCATRA_ATE_5KG;
            tipoDeCarne = "Alcatra";
        } else if (opcaoDeCarne == 2 && quantidadeCarne > 5) {
            precoInicial = quantidadeCarne * PRECO_DA_ALCATRA_ACIMA_DE_5KG;
            tipoDeCarne = "Alcatra";
        }
        if (opcaoDeCarne == 3 && quantidadeCarne <= 5) {
            precoInicial = quantidadeCarne * PRECO_DA_PICANHA_ATE_5KG;
            tipoDeCarne = "Picanha";
        } else if (opcaoDeCarne == 3 && quantidadeCarne > 5) {
            precoInicial = quantidadeCarne * PRECO_DA_PICANHA_ACIMA_DE_5KG;
            tipoDeCarne = "Picanha";

        }

        if (cartao == 1) {
            desconto = precoInicial * DESCONTO_CARTAO_TABAJARA / 100;
            aviso = "Sim";
        } else{
            aviso = "Não";
        }


        System.out.print("\n**********CUPOM FISCAL**********\n");
        System.out.print("Carne: " + tipoDeCarne);
        System.out.print("\nQuantidade (Kg): " + quantidadeCarne + " Kg");
        System.out.print("\nPreço: R$ " + precoInicial);
        System.out.print("\nCartao Tabajara: " + aviso);
        System.out.print("\nDesconto: " + desconto);
        System.out.print("\n********************************");
        scanner.close();
    }
}
