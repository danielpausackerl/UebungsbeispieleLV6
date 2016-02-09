package Bestellverwaltung;

public class AmazonDemo {

	public static void main(String[] args) {

		Bestellzeile[] zeilen = new Bestellzeile[3];
		zeilen[0] = new Bestellzeile("Asus", 1, 1000);
		zeilen[1] = new Bestellzeile("Maus", 1, 29);
		zeilen[2] = new Bestellzeile("Bildschirm", 1, 300);

		Bestellung bestellung = new Bestellung("AT15-123456", zeilen);

		bestellung.printBestellung();

		System.out.println("Gesamtkosten: " + bestellung.getKosten());

	}

}
