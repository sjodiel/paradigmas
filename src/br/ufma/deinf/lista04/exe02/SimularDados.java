/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista04.exe02;

import java.util.Random;

/**
 *
 * @author sjodiel
 */
public class SimularDados {

    public static void main(String[] args) {
        
        Random random = new Random();
        int dado1 = 0, dado2, count;
  
        int[] frequencia = new int[13];

        String output = "Soma\tFrequencia\tPorcentagem";
        
        
        for (int i = 1; i <= 36000; i++) {
            
            dado1 = 1 + random.nextInt(6);
            dado2 = 1 + random.nextInt(6);
            //System.out.println(dado1);
           // System.out.println(dado2);
            count = (dado1 + dado2);
            frequencia[count]++;
         
        }

        //totalLancamento += 36000;
        for(int i=2; i<frequencia.length;i++){
            
            int porcentagem = frequencia[i]/(36000/100);
            output += "\n" + i + "\t" + frequencia[i] + "\t\t" + porcentagem +"%";
        
        }
        
        System.out.println(output);
        /*for (int i = 0; i < frequencia.length; i++) {
            //System.out.println((i + 2) + " : " + frequencia[i]);
        }*/
    }
}
