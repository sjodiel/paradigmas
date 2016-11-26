/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista04.exe03.teste;

import java.util.Scanner;

/**
 *
 * @author sjodiel
 */
public class Exer07_19
{
	public static void main(String[] args)
	{
		// tipo boolean é inicializado com false
		boolean[] seats = new boolean[10];
		int clas, firstCount = 0, economyCount = 5;
		Scanner input = new Scanner( System.in );
		String resposta;
		
		for (int i = 0; i < seats.length; i++)
		{
			seats[i] = false;
		}
		
		while ( seats[4] == false || seats[9] == false)
		{
			System.out.print( "Please type 1 for First Class or type 2 for Economy: " );
			clas = input.nextInt();
			
			if ( clas == 1 )
				if (  seats[4] ) // se utimo assento da Primeira Classe ja estiver reservado
				{
					System.out.print( "No more seats at First Class. Do you want at Economy ? [Y/N] " );
					resposta = input.next();
					
					if(resposta.equals("Y"))
					{
						seats[economyCount] = true;
						new Tiket( 2, economyCount );
						economyCount++;
						System.out.println("Seat at Economy reserved.");
					} else System.out.println("Seat do not reserved.");
				}
				else
				{
					seats[firstCount] = true;
					new Tiket( 1, firstCount );
					firstCount++;
				}
			else if ( clas == 2)
				if ( seats[9] )
				{
					System.out.print( "No more seats at Economy. Do you want at First Class ? [Y/N] " );
					resposta = input.next();
					
					if(resposta.equals("Y"))
					{
						seats[firstCount] = true;
						new Tiket( 2, firstCount );
						firstCount++;
					} else System.out.println("Seat do not reserved.");
				}
				else
				{
					seats[economyCount] = true;
					new Tiket( 2, economyCount );
					economyCount++;
				}
			else
			{
				System.out.println( "Error. Invalid class." );
				for (int i = 0; i <= 4; i++)
					if ( seats[i] )
						System.out.println("First Class " + i + " reserved.");
					else System.out.println("First Class " + i + " NOT reserved.");
				for (int i = 5; i <= 9; i++)
					if ( seats[i] )
						System.out.println("Economy " + i + " reserved.");
					else System.out.println("Economy " + i + " NOT reserved.");
			}
		}
		System.out.println( "No more seats at all !!!" );
	}
}