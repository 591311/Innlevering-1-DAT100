package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgave7veke35 {

	public static void main(String[] args) {
		
			
	for (int i = 1; i<=10; i++) {	
		
		String poeng = showInputDialog("Tast inn poengsum ");
		 int poengsum = Integer.parseInt(poeng);
		
		if (poengsum <=100 && poengsum >= 90) {
			showMessageDialog(null, "Din poengsum er: " + poengsum + " dette tilsvarer karakter A");
		} else if (poengsum < 90 && poengsum >= 80) {
			showMessageDialog(null, "Din poengsum er: " + poengsum + " dette tilsvarer karakter B");
		} else if (poengsum < 80 && poengsum >= 60) {
			showMessageDialog(null, "Din poengsum er: " + poengsum + " dette tilsvarer karakter C");
		} else if (poengsum < 60 && poengsum >= 50) {
			showMessageDialog(null, "Din poengsum er: " + poengsum + " dette tilsvarer karakter D");
		} else if (poengsum < 50 && poengsum >=40) {
			showMessageDialog(null, "Din poengsum er: " + poengsum + " dette tilsvarer karakter E");
		} else if (poengsum < 40 && poengsum >= 0) {
			showMessageDialog(null, "Din poengsum er: " + poengsum + " dette tilsvarer karakter F");
		} else if (poengsum > 100 || poengsum < 0) {
			showMessageDialog(null, "Feilmelding: Poengsummen din er ugyldig, tallet må være mellom 0-100, prøv på nytt");
			i--;
		} 
		
	}
	}
}
