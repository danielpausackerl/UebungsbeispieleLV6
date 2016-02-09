package anlage;

public class Anlage {

	private String bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;

	public Anlage(String bezeichnung, double initialWert, int nutzungsdauer) {
		this.bezeichnung = bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
		restWert = initialWert;
		alter = 0;
	}

	public String getBezeichnung() {
		System.out.println("bezeichnung wurde ausgelesen");
		return bezeichnung;
	}

	public double getInitialWert() {
		return initialWert;
	}

	public int getNutzungsdauer() {
		return nutzungsdauer;
	}

	public double getRestWert() {
		return restWert;
	}

	public int getAlter() {
		return alter;
	}

	public void abschreiben() {
		alter++;
		if (alter <= nutzungsdauer) {
			restWert = Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));
		}

	}

	public void simulate(int maxJahre, int minWert) {
		for (int s = 0; restWert > 0 && s < maxJahre && restWert > minWert; s++) {
			abschreiben();
			System.out.println(getRestWert()+" "+s+". Jahr");
		}
	}

	public void simulate2(int maxJahre, int minWert) {
		int i = 1;

		while (restWert > 0 && restWert > minWert && i <= maxJahre) {
			abschreiben();
			System.out.println(getRestWert());
			i++;
		}
	}

	public Anlage renew(int zusatzWert, int zusatzJahre) {
		Anlage newAnlage = new Anlage(bezeichnung, getRestWert() + zusatzWert,
				getNutzungsdauer() - getAlter() + zusatzJahre);

		return newAnlage;
	}
}
