package de.bsinfo.Spielfiguren;

import de.bsinfo.Items.Item;

public abstract class Spieler extends GameObject{
	
	String name;
	Item kopf;
	Item waffe;
	Item koerper;
	Item Stiefel;

	public Spieler(int atk, int def, int agi, int hp) {
		super(atk, def, agi, hp);
	}
	
	

}
