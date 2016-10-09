/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista01.exe11;

/**
 *
 * @author sjodiel
 */
public class Losango {

    public static void main(String[] args) {
        int i, j, k;

        for (i = 1; i <= 5; i++) {// linha  

            for (k = 5; k > i; k--) { //espaço
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i) - 1; j++) {//coluna/asteriscos
                System.out.print("*");
            }
            System.out.println(" ");

        }

        for (i = 4; i >= 1; i--) {// linha  

            for (k = 5; k > i; k--) { //espaço
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i) - 1; j++) {//coluna/asteriscos
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }

}
