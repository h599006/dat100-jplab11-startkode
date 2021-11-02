package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		
		Blogg lestBlogg = null;
		
		try {
			Scanner scanner = new Scanner(new File(mappe + filnavn));
			
			int antall = Integer.parseInt(scanner.nextLine());
			
			lestBlogg = new Blogg(antall);

			while (scanner.hasNext()) {
				

				int id = 0;
				String bruker = "";
				String dato = "";
				int likes = 0;
				String tekst = "";
				String url = "";
				
				String data = scanner.nextLine();
				
				if (data.equals(TEKST)) {
					
					id = Integer.parseInt(scanner.nextLine());
					bruker = scanner.nextLine();
					dato = scanner.nextLine();
					likes = Integer.parseInt(scanner.nextLine());
					tekst = scanner.nextLine();
					
					
					Tekst nyTekst = new Tekst(id, bruker, dato, likes, tekst);
					
					lestBlogg.leggTil(nyTekst);
					
				}
				
				else if (data.equals(BILDE)) {
					id = Integer.parseInt(scanner.nextLine());
					bruker = scanner.nextLine();
					dato = scanner.nextLine();
					likes = Integer.parseInt(scanner.nextLine());
					tekst = scanner.nextLine();
					url = scanner.nextLine();
					
					Bilde nyttBilde = new Bilde(id, bruker, dato, likes, tekst, url);
					
					lestBlogg.leggTil(nyttBilde);
				}
				
				
			}
			scanner.close();
		}
		catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"Filenkanikkeåpnes");
		}
		finally {
			return lestBlogg;
		}
	}
}
