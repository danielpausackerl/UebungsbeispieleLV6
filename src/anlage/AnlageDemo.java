package anlage;

public class AnlageDemo {

	public static void main(String[] args) {

		Anlage tisch = new Anlage("tisch", 899, 7);
		// tisch.abschreiben();

		System.out.println(tisch.getRestWert());

		tisch.simulate(6, 500);

		Anlage newAnlage = tisch.renew(1000, 3);

		System.out.println(newAnlage.getRestWert());

	}

}
