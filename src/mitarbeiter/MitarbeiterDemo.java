package mitarbeiter;

public class MitarbeiterDemo {

	public static void main(String[] args) {

		Mitarbeiter m = new Mitarbeiter("Max", "Mustermann", 28000 / 12.0);

		System.out.println(m.monatsabrechnung());

		System.out.println(m.jahresAbrechnung(12));
	}

}
