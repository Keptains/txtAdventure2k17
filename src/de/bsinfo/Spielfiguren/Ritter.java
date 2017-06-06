package de.bsinfo.Spielfiguren;

import de.bsinfo.Items.Item;

public class Ritter extends Spieler{

//	public Ritter(int atk, int def, int agi, int fahAtk, int hp,
//			String name) {
//		super(atk, def, agi, fahAtk, hp, new KettenHaube(), waffe, new RostigesKettenHemd(), stiefel, name);
//	}

	public Ritter(int atk, int def, int agi, int fahAtk, int hp, Item kopf, Item waffe, Item koerper, Item stiefel,
			String name) {
		super(atk, def, agi, fahAtk, hp, kopf, waffe, koerper, stiefel, name);
	}

	@Override
	public void angriff(GameObject obj) {
		
	}

	@Override
	public void faehigkeut1(GameObject obj) {
		
	}

	@Override
	public void faehigkeut2(GameObject obj) {
		
	}

	@Override
	public void faehigkeut3(GameObject obj) {
		
	}

	@Override
	public void faehigkeut4(GameObject obj) {
		
	}

}
