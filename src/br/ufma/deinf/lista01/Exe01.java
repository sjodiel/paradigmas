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
public class Exe01 {
    
    public static void main(String[] args) {
        
        int km, litros;
        int totalKm =0;
        int totalLitros=0;
        float kmPorLitros,totalKmPorLitros;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a quilometragem: ");
        km = input.nextInt();
        
        DecimalFormat formatar = new DecimalFormat("#.##");
        
        
        while( km != -1){
            
            System.out.println("Informe os litros: ");
            litros = input.nextInt();
            
            totalKm += km;
            totalLitros += litros;
            
            if (litros !=0){
                
                kmPorLitros = (float) km/litros;
                
                
                System.out.println("Consumo em km/litros eh " + formatar.format(kmPorLitros));
                System.out.println("");
                
            
            }
            
            totalKmPorLitros = (float) totalKm/totalLitros;
            
            System.out.println("Total de km/litros: " + formatar.format(totalKmPorLitros));
            System.out.println("");
            
            System.out.println("Informe a quilometragem: ");
            km = input.nextInt();
     
           
        
        }
        
        
        
    }
    
}
