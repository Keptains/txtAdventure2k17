package de.bsinfo.Items;

import de.bsinfo.Spielfiguren.Feind;
import de.bsinfo.Spielfiguren.Spieler;

public class Heiltrank extends Verbrauch {

	public Heiltrank() {
		super("Heiltrank", "Ein kleiner Trank der 75 HP heilt");
	}

	@Override
	public void verbrauchen(Spieler spieler) {
		spieler.setHp(spieler.getHp() + 75);
	}

	@Override
	public void verbrauchen(Feind feind) {
		// TODO Auto-generated method stub
		
	}

}
