/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista04.exe03.teste2;

/**
 *
 * @author sjodiel
 */
public class Bilhete {
    
    public  Bilhete(int NumeroClasse, int fila, int poltrona ){
        System.out.println( " _______________________" );
        System.out.println("Bilhete de embarque");
        if(NumeroClasse==1){
            System.out.println("Primeira Classe. Assento: " + fila+poltrona);
        }else{
            
            System.out.println("Classe Economica. Assento: " + fila+poltrona);
        
        }
        System.out.println( " _______________________" );
    }
}
