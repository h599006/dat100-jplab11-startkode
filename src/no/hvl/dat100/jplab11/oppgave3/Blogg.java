package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	private int nesteledig;
	
	public Blogg() {

		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
		
		nesteledig = 0;
	}

	public int getAntall() {
		
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean funnet = false;
		int pos = 0;
		
		while (pos < nesteledig && !funnet) {
			if (innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
			}
			else {
				pos++;
			}
		}
		return funnet;
	}

	public boolean ledigPlass() {
		
		boolean erLedig = false;
		
		
		if (nesteledig < innleggtabell.length) {
			erLedig = true;
		}
		
		return erLedig;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean ny = finnes(innlegg);
		boolean lagtTil = false;
		
		if (!ny && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagtTil = true;
		}
		return lagtTil;
	}
	
	public String toString() {
		
		String ut = "";
		ut += getAntall() + "\n"; 

		for (int i = 0; i < innleggtabell.length; i++) {
			ut += innleggtabell[i];
		}
		
		return ut;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {

		Innlegg[] midlertidig = innleggtabell;
		innleggtabell = new Innlegg[nesteledig * 2];
		
		for (int i = 0; i < midlertidig.length; i++) {
			innleggtabell[i] = midlertidig[i];
		}
		
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		
		boolean ny = finnes(innlegg);
		boolean lagtTil = false;
		
		if (!ny && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagtTil = true;
		}
		return lagtTil;
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		boolean slettet = false;
		int pos = finnInnlegg(innlegg);
		
		if (pos != -1) {
			innleggtabell[pos] = null;
			slettet = true;
			nesteledig--;
		}
		return slettet;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}