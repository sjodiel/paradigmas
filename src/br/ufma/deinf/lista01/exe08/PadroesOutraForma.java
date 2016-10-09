/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista01.exe08;

/**
 *
 * @author sjodiel
 */
public class PadroesOutraForma {

    public static void main(String[] args) {

        int i, j, k; //k sera o espaço

        //Letra A
        for (i = 1; i <= 10; i++) {

            for (j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println("");

        }

        System.out.println("");

        //Letra B
        for (i = 10; i >= 1; i--) {

            for (j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println("");

        }
        
        //LETRA C
        
        for (i = 10; i >= 1; i--) {
            for ( k = 10; k > i; k--) {
                System.out.print(" ");
            }
            
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        //LETRA D
        
        for (i = 10; i >= 1; i--) {
            for ( k = 1; k < i; k++) {
                System.out.print(" ");
            }
            
            for (j = 10; j >= i; j--) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }

}
