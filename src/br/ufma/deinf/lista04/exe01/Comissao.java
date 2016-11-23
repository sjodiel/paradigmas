/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista04.exe01;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class Comissao {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor da venda");
        double valor = input.nextDouble();
        
        System.out.println(CalculaSalario(valor));
        
        
    }
    
    
    public static String CalculaSalario(double valor){
    
        int[] total = new int[9];
        for(int i=0;i<total.length;i++){
            total[i]=0;
        }
        
        double salario = valor * 0.09 + 200;
        int intervalo = (int)salario/100;
        
        if(intervalo>9){
            intervalo=10;
        }
        
        ++total[intervalo-2];
        
        String output = "Intervalo\t\tQuantidade";
        
        for(int intervalo_ = 0; intervalo_<total.length-1;intervalo_++ ){
            output += "\nR$" + (200 + 100 * intervalo_) + "-R$" 
                    + (299 + 100 * intervalo_) + "\t\t" + total[ intervalo_ ] ;
            
        }
        output += "\nR$1000 E MAIS\t\t" + total[ total.length - 1 ];
        
        return output;
    }
}
