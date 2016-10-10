/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista01;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class Exe03 {

    public static void main(String[] args) {

        int horasTrabalhadas;
        int empregado;
        int salarioHora;
        //double salarioBruto;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe as horas trabalhadas:");
        horasTrabalhadas = input.nextInt();
        System.out.println("Informe o salario hora:");
        salarioHora = input.nextInt();

        if (horasTrabalhadas <= 40) {

            empregado = (horasTrabalhadas * salarioHora);

        } else {

            empregado = 40 * salarioHora;
            empregado += (horasTrabalhadas - 40) * (salarioHora * 1.5);
            //emp[i] += (h[i]-40)*(s[i]*1.5);

        }

        System.out.println("\nEmpregado:");
        System.out.println("Salario-hora: " + salarioHora);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Salário Final: " + empregado);

    }
}
