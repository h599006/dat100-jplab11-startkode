package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.*;
import javax.swing.*;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;


public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		boolean bleSkrevet = false;
		
		try {
			
			File utfil = new File(mappe + filnavn);
			PrintWriter skriver= new PrintWriter(utfil);
			
			skriver.println(samling.toString());
			
			skriver.close();
			bleSkrevet = true;
			
		}
		catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"Filenkanikkeåpnes");
		}
		finally {
			return bleSkrevet;
		}
	}
}
