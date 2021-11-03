package no.hvl.dat100.jplab11.oppgave6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;
import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class HtmlBlogg extends Blogg {

	public HtmlBlogg() {
		super();
	}
	
	private static String HTMLPREFIX = 
			"<html>\n\t<head>\n\t\t<title>DAT100 Blogg</title>\n\t</head>\n\t<body>\n";
	
	private static String HTMLPOSTFIX = 
			"\t</body>\n</html>";
	
	@Override
	public String toString() {

		Innlegg[] samling = getSamling();	
		String ut = "";
		
		/*
		System.out.println(samling[0].toHTML());
		System.out.println("--------------");
		System.out.println(samling[1].toHTML());
		*/
		ut += HTMLPREFIX;
		
		for (int i = 0; i < getAntall(); i++) {
			ut += samling[i].toHTML();
		}
			
			
		
		ut+= HTMLPOSTFIX;
			
		return ut;
	}
}
