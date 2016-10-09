/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista01.exe09;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class Produto {

    public static void main(String[] args) {

        double produto1 = 0,
                produto2 = 0,
                produto3 = 0,
                produto4 = 0,
                produto5 = 0;

        int produto = 1, quantidade = 0;

        Scanner input = new Scanner(System.in);

        while (produto != 0) {

            System.out.println("Produto 1 - $2,98;\n"
                    + "Produto 2 - $4,50;\n"
                    + "Produto 3 - $9,98;\n"
                    + "Produto 4 - $4,49;\n"
                    + "Produto 5 - $6,87.");

            System.out.println("\nInforme o numero do produto: ");
            produto = input.nextInt();

            if (produto != 0) {
                
                System.out.println("Informe a quantidade: ");
                quantidade = input.nextInt();

                switch (produto) {

                    case 1:
                        produto1 += quantidade * 2.98;
                        break;
                    case 2:
                        produto2 += quantidade * 4.50;
                        break;
                    case 3:
                        produto3 += quantidade * 9.98;
                        break;
                    case 4:
                        produto4 += quantidade * 4.49;
                        break;
                    case 5:
                        produto5 += quantidade * 6.87;
                        break;

                    default:
                        System.out.println("\nOpcao invalida!");
                        break;

                }

            }
        }

        System.out.printf("Produto 1 - %s\nProduto 2 - %s\nProduto 3 - %s\nProduto 4 - %s\n"
                + "Produto 5 - %s\n", produto1, produto2, produto3, produto4, produto5);

    }

}
