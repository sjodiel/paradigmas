/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista01.exe12;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class Losango2 {

    public static void main(String[] args) {

        int i, j, k, numLinha;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero impar no intervalo 1-19");
        numLinha = input.nextInt();

        while (numLinha > 19 || numLinha < 0 || numLinha % 2 == 0) {

            System.out.println("Valor Invalido ");

            System.out.println("Informe um numero impar no intervalo 1-19");
            numLinha = input.nextInt();

        }

        for (i = 1; i <(numLinha/2)+1; i++) {// linha  (i = 1; i <=(numLinha/2)+1; i++)

            for (k = (numLinha/2); k >= i; k--) { //espaço  (k = (numLinha/2)+1; k > i; k--) 
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i) - 1; j++) {//coluna/asteriscos
                System.out.print("*");
            }
            System.out.println(" ");

        }

        for (i = ((numLinha-1)/2)+1; i >= 1; i--) {// linha  (i = ((numLinha-1)/2); i >= 1; i--)

            for (k = (numLinha/2); k >= i; k--) { //espaço //(k = (numLinha/2)+1; k > i; k--)
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i) - 1; j++) {//coluna/asteriscos
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }

}
