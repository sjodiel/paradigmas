/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista01.exe13;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class SeriePi {

    public static void main(String[] args) {

        double valorPi = 0.0, numero = 4.0, demo = 1.0;
        int termo;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o termo: ");
        termo = input.nextInt();

        System.out.println("Termo \t Pi");
        
        for (int i = 1; i <= termo; i++) {
            
            if(i%2 != 0){
            
                valorPi += numero/demo;
                
            }else{
                
                valorPi -= numero/demo;
            }
            
            demo += 2.0;
           
            System.out.printf("%d \t  %s\n", i, valorPi);
        }
        
        

    }
}
