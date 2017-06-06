package de.bsinfo.Spielfiguren;

public abstract class GameObject implements Attack {

	int atk;
	int def;
	int agi;
	int fahAtk;
	int hp;

	public GameObject(int atk, int def, int agi, int fahAtk, int hp) {
		this.atk = atk;
		this.def = def;
		this.agi = agi;
		this.fahAtk = fahAtk;
		this.hp = hp;
	}

	public int getFahAtk() {
		return fahAtk;
	}

	public void setFahAtk(int fahAtk) {
		this.fahAtk = fahAtk;
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

}

interface Attack {

	public void angriff(GameObject obj);

	public void faehigkeut1(GameObject obj);

	public void faehigkeut2(GameObject obj);

	public void faehigkeut3(GameObject obj);

	public void faehigkeut4(GameObject obj);

}