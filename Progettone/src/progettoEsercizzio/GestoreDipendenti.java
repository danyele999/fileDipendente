package progettoEsercizzio;

import progettoEsercizzio.Dipendente.Dipartimento;
import progettoEsercizzio.Dipendente.Livello;

public class GestoreDipendenti {

	public static void main(String[] args) {
		Dipendente pippo = new Dipendente("3123", 5, Livello.OPERAIO, Dipartimento.PRODUZIONE, 1000);
		Dipendente pluto = new Dipendente("ziota", 5, Livello.OPERAIO, Dipartimento.PRODUZIONE, 1000);
		Dipendente papero = new Dipendente("adaf", 5, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE, 1000);
		Dipendente topolo = new Dipendente("sdafgdf", 5, Livello.DIRIGENTE, Dipartimento.VENDITE, 1000);
		
		System.out.println(pippo.promuovi());
		System.out.println(papero.promuovi());
		pippo.stampa();
		pluto.stampa();
		papero.stampa();
		topolo.stampa();
		double somma = Dipendente.calcola2(pippo, 5);
		somma += Dipendente.calcola2(pluto, 5);
		somma += Dipendente.calcola2(papero, 5);
		somma += Dipendente.calcola2(topolo, 5);
		System.out.println(somma);
}
}
