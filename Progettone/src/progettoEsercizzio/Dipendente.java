package progettoEsercizzio;

public class Dipendente {
	private static final int stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private int importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	private double oreDiStraordinario = 5;

	public static enum Livello {
		OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE
	}

	public static enum Dipartimento {
		PRODUZIONE, AMMINISTRAZIONE, VENDITE
	}

	public Dipendente(String matricol, String tuo, Dipartimento m) {
		stipendio = stipendioBase;
		importoOrarioStraordinario = 30;
		livello = Livello.OPERAIO;
		dipartimento = Dipartimento.PRODUZIONE;

	}

	public Dipendente(String matricola, int oreStrao, Livello ilTuo, Dipartimento ilSuo, double stipendio) {
		this.matricola = matricola;
		importoOrarioStraordinario = oreStrao;
		livello = ilTuo;
		dipartimento = ilSuo;
		this.stipendio = stipendio;
	}

	public Livello promuovi() {
		switch (livello) {
		case OPERAIO:
			livello = Dipendente.Livello.IMPIEGATO;
			stipendio = stipendioBase * 1.2;
			break;
		case IMPIEGATO:
			livello = Dipendente.Livello.QUADRO;
			stipendio = stipendioBase * 1.5;
			break;
		case QUADRO:
			livello = Dipendente.Livello.DIRIGENTE;
			stipendio = stipendioBase * 2;
			break;
		case DIRIGENTE:
			System.out.println("hai raggiunto il livello massimo disponibile. ");
			break;

		}
		return livello;

	}

	public static double calcolaPaga(Dipendente gigi) {
		return gigi.stipendio;
	}

	public static double calcola2(Dipendente eus, int ore) {
		return eus.stipendio + (ore * eus.importoOrarioStraordinario);
	}

	public double getPaga22(double oreStraordinario, boolean isSimulation) {
		double oreEffettive = 0;
		if(isSimulation == true) {
			oreEffettive = oreStraordinario;
		}else {
			oreEffettive = this.oreDiStraordinario;
		}
		return oreEffettive;
	}

	public void stampa() {
		System.out.println(" matricola " + matricola + " stipendio: " + stipendio + " importo ore straordinario: "
				+ importoOrarioStraordinario + " livello: " + livello + " dipartimento: " + dipartimento);
		return;

	}

	public double getOreDiStraordinario() {
		return oreDiStraordinario;
	}

	public void setOreDiStraordinario(double oreDiStraordinario) {
		this.oreDiStraordinario = oreDiStraordinario;
	}

	public int getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(int importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public static int getStipendiobase() {
		return stipendioBase;
	}

	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public Livello getLivello() {
		return livello;
	}

	public static double calcolaStidendioMensile(Dipendente[] staff, double[] oreStraordinario) {
		double somma = 0;
		for (int i = 0; i < staff.length; i++) {
			somma += staff[i].getPaga22(oreStraordinario[i], true);
		}
		return somma;
	}

}
