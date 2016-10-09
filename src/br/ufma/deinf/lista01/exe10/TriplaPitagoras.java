/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista01.exe10;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class TriplaPitagoras {

    public static void main(String[] args) {
        
        int lado1, lado2, hipotenusa;
        //Scanner input = new Scanner(System.in);
        
        
        for (lado1 = 1; lado1 <= 500; lado1++) {
            for (lado2 = 1; lado2 <=500; lado2++) {
                for (hipotenusa = 1; hipotenusa <= 500; hipotenusa++) {
                   
                    
                    
                    /*if ( Math.pow(lado1,2) + Math.pow(lado2, 2) == Math.pow(hipotenusa, 2) ) {
                        System.out.printf("Lado1: %s Lado2: %s e Hipotenusa: %s\n", lado1, lado2, hipotenusa);
                    }*/
                    
                       
                    if ( (lado1*lado1) + (lado2*lado2) == (hipotenusa*hipotenusa) ) {
                        System.out.printf("Lado1: %d Lado2: %d e Hipotenusa: %d\n", lado1, lado2, hipotenusa);
                    }
                    
                }
                
            }
            
        }
    }

}
