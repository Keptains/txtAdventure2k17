package de.bsinfo.Items;

import de.bsinfo.Spielfiguren.GameObject;

public class Item implements ItemFaehigkeit {

	boolean hatFaehigkeit;
	String name;
	String beschreibung;

	ItemTyp typ;

	int atk;
	int def;
	int agi;
	int fahAtk;
	int hp;

	public Item(int atk, int def, int agi, int fahAtk, int hp, String name, String beschreibung, ItemTyp typ,
			boolean hatFaehigkeit) {
		this.atk = atk;
		this.def = def;
		this.agi = agi;
		this.fahAtk = fahAtk;
		this.hp = hp;
		this.name = name;
		this.beschreibung = beschreibung;
		this.typ = typ;
		this.hatFaehigkeit = hatFaehigkeit;
	}

	@Override
	public String toString() {
		return name + System.lineSeparator() + beschreibung + System.lineSeparator();
	}

	public ItemTyp getTyp() {
		return typ;
	}

	public void setTyp(ItemTyp typ) {
		this.typ = typ;
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

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getAgi() {
		return agi;
	}

	public void setAgi(int agi) {
		this.agi = agi;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public void itemFaehigkeit(GameObject obj) {
		
	}

}

interface ItemFaehigkeit {

	public void itemFaehigkeit(GameObject obj);

}
