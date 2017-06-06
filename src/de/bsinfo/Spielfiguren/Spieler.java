package de.bsinfo.Spielfiguren;

import de.bsinfo.Items.Item;

public abstract class Spieler extends GameObject {

	String name;
	Item kopf;
	Item waffe;
	Item koerper;
	Item stiefel;

	public Spieler(int atk, int def, int agi, int fahAtk, int hp, Item kopf, Item waffe, Item koerper, Item stiefel,
			String name) {
		super(atk, def, agi, fahAtk, hp);
		this.name = name;
		this.kopf = kopf;
		this.waffe = waffe;
		this.koerper = koerper;
		this.stiefel = stiefel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item getKopf() {
		return kopf;
	}

	public void setKopf(Item kopf) {
		this.kopf = kopf;
	}

	public Item getWaffe() {
		return waffe;
	}

	public void setWaffe(Item waffe) {
		this.waffe = waffe;
	}

	public Item getKoerper() {
		return koerper;
	}

	public void setKoerper(Item koerper) {
		this.koerper = koerper;
	}

	public Item getStiefel() {
		return stiefel;
	}

	public void setStiefel(Item stiefel) {
		this.stiefel = stiefel;
	}

}
