import java.sql.Statement;
import java.util.ArrayList;

import de.bsinfo.Items.Item;
import de.bsinfo.Items.ItemTyp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestMain {
	
	static Connection con = null;
	
	static ArrayList<Item> itemsKoerper = new ArrayList<>();
	static ArrayList<Item> itemsKopf = new ArrayList<>();
	static ArrayList<Item> itemsWaffen= new ArrayList<>();
	static ArrayList<Item> itemsStiefel = new ArrayList<>();

	public static void main(String[] args) {
		
		loadArrayList();
		
	}

	private static void loadArrayList() {
		String[] x = TestMain.class.getResource("/res/Item.db").toString().split("file:");
		String CON_STRING = "jdbc:sqlite:" + x[1];
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection(CON_STRING);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		getKoerperItem(CON_STRING);
		getKopfItem(CON_STRING);
		getStiefelItem(CON_STRING);
		getWaffenItem(CON_STRING);
		
	}

	private static void getWaffenItem(String CON_STRING) {
		try {
			String statement = "SELECT * FROM Waffen";
			Statement stmt = con.createStatement();
			ResultSet res =  stmt.executeQuery(statement);
			while(res.next()){
				itemsWaffen.add(new Item(res.getInt("ATK"), res.getInt("DEF"), res.getInt("AGI"), res.getInt("FAHATK"),
						res.getInt("HP"), res.getString("Name"), res.getString("Beschreibung"), ItemTyp.Koerper, false));
			}
			for(Item z : itemsWaffen){
				System.out.println(z);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void getStiefelItem(String CON_STRING) {
		try {
			Connection con = DriverManager.getConnection(CON_STRING);
			String statement = "SELECT * FROM Stiefel";
			Statement stmt = con.createStatement();
			ResultSet res =  stmt.executeQuery(statement);
			while(res.next()){
				itemsStiefel.add(new Item(res.getInt("ATK"), res.getInt("DEF"), res.getInt("AGI"), res.getInt("FAHATK"),
						res.getInt("HP"), res.getString("Name"), res.getString("Beschreibung"), ItemTyp.Koerper, false));
			}
			for(Item z : itemsStiefel){
				System.out.println(z);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void getKopfItem(String CON_STRING) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(CON_STRING);
			String statement = "SELECT * FROM Kopf";
			Statement stmt = con.createStatement();
			ResultSet res =  stmt.executeQuery(statement);
			while(res.next()){
				itemsKopf.add(new Item(res.getInt("ATK"), res.getInt("DEF"), res.getInt("AGI"), res.getInt("FAHATK"),
						res.getInt("HP"), res.getString("Name"), res.getString("Beschreibung"), ItemTyp.Koerper, false));
			}
			for(Item z : itemsKopf){
				System.out.println(z);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void getKoerperItem(String CON_STRING) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(CON_STRING);
			String statement = "SELECT * FROM KOERPER";
			Statement stmt = con.createStatement();
			ResultSet res =  stmt.executeQuery(statement);
			while(res.next()){
				itemsKoerper.add(new Item(res.getInt("ATK"), res.getInt("DEF"), res.getInt("AGI"), res.getInt("FAHATK"),
						res.getInt("HP"), res.getString("Name"), res.getString("Beschreibung"), ItemTyp.Koerper, false));
			}
			for(Item z : itemsKoerper){
				System.out.println(z);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
