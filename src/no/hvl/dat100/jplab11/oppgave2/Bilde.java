package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		super(id, bruker, dato, tekst);
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		super(id, bruker, dato, likes, tekst);
		this.url = url;
	}
	
	public String getUrl() {
		
		return url;
	}

	public void setUrl(String url) {
		
		this.url = url;
	}

	@Override
	public String toString() {
		String ut = "";
		ut += super.toString().replace("TEKST", "BILDE") + this.getUrl() + "\n";
		
		return ut;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		String ut = "";
		ut += super.toHTML();
		ut+= "\t\t<iframe src=\"" + getUrl() + "\" height=600 width=600></iframe>\n";
		
		return ut;	
				
	}
}
