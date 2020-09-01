package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgave6innlevering1 {

	public static void main(String[] args) {
		
		String N = showInputDialog("Skriv inn verdien til n: ");
			int n = Integer.parseInt(N);
			int x = 1;
			int a = n;
			
			while (n>1) {
				x *= n;
				n--;
			}
			showMessageDialog(null, a + "! tilsvarer: " + x);
		
	}
}
