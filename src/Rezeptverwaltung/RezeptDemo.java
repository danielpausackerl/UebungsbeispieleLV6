package Rezeptverwaltung;

public class RezeptDemo {

	public static void main(String[] args) {

		Zutat[] zutaten = new Zutat[4];
		zutaten[0] = new Zutat("Mehl", 300);
		zutaten[1] = new Zutat("Butter", 300);
		zutaten[2] = new Zutat("Zucker", 300);
		zutaten[3] = new Zutat("Eier", 2);

		byte personen = 4;
		Rezept keks = new Rezept("Keks", (byte) 4, zutaten);

		keks.printRezept();

		Rezept keks8 = keks.umrechnen((byte) 8);
		keks8.printRezept();

	}

}
