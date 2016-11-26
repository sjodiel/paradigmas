/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista04.exe03;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class Sistema {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean menu = true;
        int escolha, fila, nPoltrona;
        String poltrona, resposta, msg;
        Aviao aviao  = new Aviao(20, 6);
        Assento reserva;
        
        while(menu){
            exibeMenu();
            escolha = input.nextInt();
            
            switch(escolha){
                case 1:
                    
                    aviao.exibeReservas();
                    System.out.println("");
                    break;
                case 2:
                    reserva = new Assento();
                    System.out.print("Informe a fila :");
                    reserva.setFila(input.nextInt());
                    
                    System.out.println("Informe a poltrona :");
                    poltrona = input.next();
                    reserva.setPoltrona(aviao.convertLetra(poltrona));
                    
                    String status = aviao.reservar(reserva); //passando o ingresso para reservar o lugar.
                    System.out.println(status);
                    break;
                
            
            }
            
        }

        //exibeMenu();

    }

    public static void exibeMenu() {

        System.out.println("----------------------------------------------");
        System.out.println("1 -- Mostrar Reservas");
        System.out.println("3 -- Fazer Reserva");
        System.out.println("0 -- SAIR");

        System.out.print("Digite a opcao : ");
        System.out.println("");

    }
    
    

}
