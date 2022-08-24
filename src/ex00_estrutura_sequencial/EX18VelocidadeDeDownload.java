package cad01_estrutura_sequencial.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que peça o tamanho de um arquivo para download (MB) e a velocidade de um link de internet
//(Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos);
public class EX18VelocidadeDeDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo (MB): ");
        Double tamanhoArquivo = scanner.nextDouble();

        System.out.print("Informe a velocidade da internet (Mbps): ");
        Double velocidadeNet = scanner.nextDouble();

        Double tamanhoBits = tamanhoArquivo * 1024 * 1024 * 8;
        Double tempoEmSegundos = obterTempoAproximado(tamanhoBits, velocidadeNet);
        Double tempoEmMinutos = obterTempoEmMinutos(tempoEmSegundos);

        System.out.println("Tempo estimado: " + tempoEmMinutos + " minutos");
        scanner.close();
    }

    private static double obterTempoAproximado(Double tamanhoBits, Double velocidadeNet) {
        return tamanhoBits/ (velocidadeNet * 1024 * 1024);
    }

    private static double obterTempoEmMinutos(Double tempoAproximado) {
        return tempoAproximado / 60;
    }
}
