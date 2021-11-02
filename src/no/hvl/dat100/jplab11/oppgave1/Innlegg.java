package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {

		this.bruker = bruker;
	}

	public String getDato() {
		
		return dato;
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		
		return id;
	}

	public int getLikes() {
		
		return likes;
	}
	
	public void doLike () {

		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {

		if (innlegg.getId() == this.id) {
			return true;
		}
		else {
			return false;
		}

	}
	
	@Override
	public String toString() {
		
		int id = this.getId();
		String bruker = this.getBruker();
		String dato = this.getDato();
		int likes = this.getLikes();
		String ut = "";
		
		ut += id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		
		return ut;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		String ut = "";

		ut += "\t<h2>" + getBruker() + "@" + getDato() + "[" + getId() + "]<h2>\n";

		return ut;		
	}
}
