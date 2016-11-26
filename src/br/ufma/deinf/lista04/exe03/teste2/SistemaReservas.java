/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista04.exe03.teste2;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class SistemaReservas {

    public static void main(String[] args) {

        boolean[][] assentos = new boolean[20][6];
        //char[] poltronas = new char[6];
        //char[] poltronas = {'A', 'B', 'C', 'D', 'E', 'F'};
        int fila, poltrona;

        int primeiraClasseFila = 0,
                economicaClasseFila = 5,
                classe;
        String reposta;
        Scanner input = new Scanner(System.in);
        Bilhete bilhete;

        for (boolean[] assento : assentos) {
            for (int j = 0; j < assento.length; j++) {
                assento[j] = false;
                // poltronas[i] = {'A','B','C','D','E','F'};
            }
        }
        /*for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                assentos[i][j] = false;
                // poltronas[i] = {'A','B','C','D','E','F'};
            }
        }

        for (int j = 0; j < poltronas.length; j++) {
            System.out.print(poltronas[j]);
            System.out.print("\t");
        }*/

        System.out.println("");
        for (int i = 0; i < assentos.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < assentos[i].length; j++) {
                //assentos[i][j];
                System.out.print(assentos[i][j]);
                System.out.print("\t");
            }
            System.out.println("");

        }

        while (assentos[4][5] == false || assentos[19][5] == false) {

            System.out.println("Informe a Classe: 1 para Primeira Classe"
                    + " - 2 para Classe Economica.");
            classe = input.nextInt();

            switch (classe) {
                case 1:
                    if (assentos[5][5]) {

                        System.out.println("Nao ha lugares na 1ª Classe,deseja ir na Economica (S/N) ?");
                        reposta = input.next();

                        if (reposta.equalsIgnoreCase("S")) {

                            System.out.println("Informe a fila e o assento");
                            fila = input.nextInt();
                            poltrona = input.nextInt();
                            assentos[fila][poltrona] = true;
                            bilhete = new Bilhete(2, fila, poltrona);
                            //primeiraClasseFila++;
                            //assentoPrimeira++;
                            System.out.println("Assento revervado na classe Economica");
                        } else {
                            System.out.println("Assento nao foi reservado");
                        }

                    } else {

                        System.out.println("Informe a fila e o assento");
                        fila = input.nextInt();
                        poltrona = input.nextInt();

                        assentos[fila][poltrona] = true;
                        bilhete = new Bilhete(1, fila, poltrona);
                        //primeiraClasse++;
                    }
                    break;
                case 2:
                    if (assentos[19][5]) {

                        System.out.println("Nao ha lugares na Classe Economica,deseja ir na 1ª Classe (S/N) ?");
                        reposta = input.next();

                        if (reposta.equalsIgnoreCase("S")) {
                            System.out.println("Informe a fila e o assento");
                            fila = input.nextInt();
                            poltrona = input.nextInt();
                            assentos[fila][poltrona] = true;
                            bilhete = new Bilhete(1, fila, poltrona);
                            System.out.println("Assento revervado na 1ª Classe.");
                        } else {
                            System.out.println("Assento nao foi reservado.");
                        }

                    } else {

                        System.out.println("Informe a fila e o assento");
                        fila = input.nextInt();
                        poltrona = input.nextInt();
                        assentos[fila][poltrona] = true;
                        bilhete = new Bilhete(2, fila, poltrona);
                    }
                    break;
                default:
                    System.out.println("Classe Invalida!");
                    for (int i = 0; i <= 4; i++) {
                        for (int j = 0; j <= 5; j++) {
                            if (assentos[i][j]) {
                                System.out.println("Primeira Classe " + i+j + " reservado.");
                            } else {
                                System.out.println("Primeria Classe " + i+j + " nao reservado.");
                            }
                        }
                    }

                    for (int i = 5; i <= 19; i++) {
                        for (int j = 0; j <= 5; j++) {
                            if (assentos[i][j]) {
                                System.out.println("Classe Economica  " + i+j + " reservado.");
                            } else {
                                System.out.println("Classe Economica " + i+j + " nao reservado.");
                            }
                        }
                    }
                    break;
            }

        }

        System.out.println("Nao ha mais assentos. Todos reservados !!!");
    }

}
