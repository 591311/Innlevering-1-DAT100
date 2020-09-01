package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class oppgave6veke35 {

	public static void main(String[] args) { 
		
		String Inntekt = showInputDialog("Kva er bruttoinntekta?" );
			int brutto = Integer.parseInt(Inntekt);
		// Dersom inntekta er høgare enn 165 000kr, vil satsen vere 1.9%
		// Dersom inntekta er høgare enn 250 000kr, vil satsen vere 4.2%
		// Dersom inntekta er høgare enn 600 000kr, vil satsen vere 13.2%
		// Dersom inntekta er høgare enn 990 000kr, vil satsen vere 16.2%
	
	int trinn1 = 150000; // 0.93%
	int trinn2 = 250000; // 2.41%
	int trinn3 = 600000; // 11.52%
	int trinn4 = 990000; // 14.52%
	 
	if (brutto>trinn4) {
		double skatt = brutto * (double) 0.1452;
		showMessageDialog(null, "Du tilhører skattetrinn 4, Inntekta di er " + brutto + "kr" + " og skatten din er " + skatt + "kr");
	}
	else if (brutto>trinn3) {
			double skatt2 = brutto * (double) 0.1152;
		showMessageDialog(null, "Du tilhører skattetrinn 3, Inntekta di er " + brutto + "kr" + " og skatten din er " + skatt2 + "kr");
		}
	else if (brutto>trinn2) {
		double skatt3 = brutto * (double) 0.0241;
		showMessageDialog(null, "Du tilhører skattetrinn 3, Inntekta di er " + brutto + "kr" + " og skatten din er " + skatt3 + "kr");
	}
	else if (brutto>trinn1) {
	double skatt4 = brutto * (double) 0.0093;
	showMessageDialog(null, "Du tilhører skattetrinn 3, Inntekta di er " + brutto + " kr" + " og skatten din er " + skatt4 + "kr");
	}
	else {
		showMessageDialog(null, "Du tilhører skattetrinn 0, altså ingen skatt. Inntekta di er " + brutto + " kr");
		
	}
	}
}
