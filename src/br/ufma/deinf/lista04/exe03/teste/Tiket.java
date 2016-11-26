/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista04.exe03.teste;

/**
 *
 * @author sjodiel
 */
public class Tiket {
    	public Tiket( int classNumber, int seat )
	{
		System.out.println( " _______________________" );
		System.out.println("( Boarding Tiket        )");
		
		if( classNumber == 1 )
			System.out.println( "( First Class. Seat: " + seat + "  )");
		else System.out.println( "( Economy Class. Seat: " + seat + ")");
		
		System.out.println( "(_______________________)" );
}
}
