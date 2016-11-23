/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista04.exe01;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        String resposta = "";
        double totalVendas;
        int[] estatistica = new int[9];

        while (continuar) {
            while (resposta.equals("S") || !resposta.equals("N")) {
                System.out.print("Cadastrar novo funcionárcio ? [S/N] ");
                resposta = input.next();
                resposta = resposta.toUpperCase();

                if (resposta.equals("N")) {
                    continuar = false;
                } else if (!resposta.equals("S")) {
                    System.out.println("Resposta inválida !");
                }

                if (resposta.equals("S")) {
                    System.out.print("Total de vendas do funcionário: ");
                    totalVendas = input.nextInt();
                    totalVendas = (totalVendas * 0.09) + 200; // 9% do total das vendas
                    // + 200 de salário 

                    if (totalVendas >= 1000) {
                        estatistica[8]++;
                    } else if (totalVendas >= 900) {
                        estatistica[7]++;
                    } else if (totalVendas >= 800) {
                        estatistica[6]++;
                    } else if (totalVendas >= 700) {
                        estatistica[5]++;
                    } else if (totalVendas >= 600) {
                        estatistica[4]++;
                    } else if (totalVendas >= 500) {
                        estatistica[3]++;
                    } else if (totalVendas >= 400) {
                        estatistica[2]++;
                    } else if (totalVendas >= 300) {
                        estatistica[1]++;
                    } else {
                        estatistica[0]++;
                    }
                }
            }

            // Imprime array de estatísticas de salários
            for (int i = 0; i < estatistica.length; i++) {
                System.out.println((i * 100 + 200) + "+ : " + estatistica[i]);
            }
        }
    }

}
