package mitarbeiter;

public class Mitarbeiter {

	private String vorname;
	private String nachname;
	private int mitarbeiternummer;
	private double gehalt;
	private int alter;
	private static int counter = 1;

	public Mitarbeiter(String vorname, String nachname, double gehalt) {

		this.vorname = vorname;
		this.nachname = nachname;
		this.mitarbeiternummer = counter++;
		this.gehalt = gehalt;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getVorname() {
		return vorname;
	}

	public int getMitarbeiternummer() {
		return mitarbeiternummer;
	}

	public double monatsabrechnung() {
		double jahresGehalt = gehalt * 12;
		jahresGehalt = jahresGehalt * 0.8;
		double steuer = 0;

		if (jahresGehalt > 50000) {
			steuer += (jahresGehalt - 50000) * 0.60;
			jahresGehalt = 50000;
		}
		if (jahresGehalt > 30000) {
			steuer += (jahresGehalt - 30000) * 0.45;
			jahresGehalt = 30000;
		}
		if (jahresGehalt > 20000) {
			steuer += (jahresGehalt - 20000) * 0.32;
			jahresGehalt = 20000;
		}
		if (jahresGehalt > 10000) {
			steuer += (jahresGehalt - 10000) * 0.20;
			jahresGehalt = 10000;
		}

		steuer += jahresGehalt * 0.10;

		System.out.println(steuer);

		return (((gehalt * 12) * 0.8) - steuer) / 12.0;
	}

	public double jahresAbrechnung(int monate) {
		return monatsabrechnung() * monate;
	}

	public double jahresAbrechnung() {
		return jahresAbrechnung(12);
	}

}
