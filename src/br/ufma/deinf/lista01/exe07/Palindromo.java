/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista01.exe07;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class Palindromo {

    public static void main(String[] args) {

        int d1, d2, d3, d4, d5;
        int count = 0, digitos = 0, numero = 0;
        Scanner input = new Scanner(System.in);
        
        while (digitos != 5) {

            System.out.println("Digite um numero de ate digitos: ");
            numero = input.nextInt();

            if (numero >= 100000) {

                System.out.println("Numero possui mais de 5 digitos.");
                System.out.println("");

            } else if (numero > 9999) {

                digitos = 5;

            } else {

                System.out.println("O numero deve ter 5 digitos.");
                System.out.println("");
            }

        }

        d1 = numero / 10000;      //  11211/10000 = 1,1211
        //System.out.println(d1);
        d2 = numero % 10000 / 1000; // 11211%10000 = 1211/1000 = 1,211
        //System.out.println(d2);
        //d3 = numero % 10000 % 1000 / 100; //11211%10000 = 1211%1000 = 211 / 100 = 2,11
        //System.out.println(d3);
        d4 = numero % 10000 % 1000 % 100 / 10;  //11211 % 10000 = 1211 % 1000 = 211 % 100 = 11/10 = 1,1
       // System.out.println(d4);
        d5 = numero % 10000 % 1000 % 100 % 10;    //11211 % 10000 = 1211 % 1000 = 211 % 100 = 11 % 10 = 1
        //System.out.println(d5);
        
        if (d1 == d5 && d2 == d4 ){
        
            System.out.println("Eh palindromo! ");
            System.out.println("");
            
        }else{
            
            System.out.println("Nao eh palindromo! ");
            System.out.println("");
        
        }
        

    }

}
