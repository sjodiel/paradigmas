/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista01;

/**
 *
 * @author sjodiel
 */
public class Exe05 {
    
    public static void main(String[] args) {
        
        int count=1;
        
        while(count<=10){
            
            System.out.println(count % 2 == 1 ? "****" : "+++++++++");
            
           /* if (count%2==1) {
                System.out.println("****");
            } else {
                System.out.println("+++++++++");
            }*/
            
            
            ++count;
        }
    }
    
}
