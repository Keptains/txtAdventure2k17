package de.bsinfo.Items;

import de.bsinfo.Spielfiguren.Feind;
import de.bsinfo.Spielfiguren.Spieler;

public abstract class Verbrauch implements Verbrauchen {

	String name;
	String beschreibung;

	@Override
	public String toString() {
		return name + System.lineSeparator() + beschreibung + System.lineSeparator();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public Verbrauch(String name, String beschreibung) {
		this.name = name;
		this.beschreibung = beschreibung;
	}

}

interface Verbrauchen {
	public void verbrauchen(Spieler spieler);
	
	public void verbrauchen(Feind feind);
}