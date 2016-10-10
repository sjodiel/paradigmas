/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class Exe02 {

    public static void main(String[] args) {

        //int salario = 200, item = 1;
        double bruto = 0.0, lucro;
        int produto = 0, vendido;

        Scanner input = new Scanner(System.in);

        System.out.println("Item 1 - $2,98;\n"
                + "Item 2 - $4,50;\n"
                + "Item 3 - $9,98;\n"
                + "Item 4 - $4,49;\n"
                + "Item 5 - $6,87.");

        while (produto < 5) {

            produto++;

            System.out.println("Informe a quantidade vendidas do item " + produto);
            vendido = input.nextInt();

            if (produto == 1) {
                bruto += vendido * 2.98;
            } else if (produto == 2) {
                bruto += vendido * 4.50;
            } else if (produto == 3) {
                bruto += vendido * 9.98;
            } else if (produto == 4) {
                bruto += vendido * 4.49;
            } else if (produto == 5) {
                bruto += vendido * 4.87;
            }

            /*
            
            switch (produto) {
                case 1:
                    bruto += vendido * 5000;
                    break;
                case 2:
                    bruto += vendido * 4.50;
                    break;
                case 3:
                    bruto += vendido * 9.98;
                    break;
                case 4:
                    bruto += vendido * 4.49;
                    break;
                case 5:
                    bruto += vendido * 4.87;
                    break;
                default:
                    break;
            }
            
             */
        }

        DecimalFormat formatar = new DecimalFormat("#.##");

        lucro = 0.09 * bruto + 200;
        System.out.println("\nLucro da semana: " + formatar.format(lucro));

    }

}
