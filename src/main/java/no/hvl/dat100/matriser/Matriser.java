package no.hvl.dat100.matriser;

public class Matriser {

		// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++){
				System.out.print(matrise[i][j] + "");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String tekst = "";

		for(int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++){

				if (j > 0) {
					tekst = tekst + " ";
				}

				tekst = tekst + matrise[i][j];
			}
			tekst = tekst + "\n";
		}
		return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] resultat = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			resultat[i] = new int[matrise[i].length];

			for (int j = 0; j < matrise[i].length; j++) {
				resultat[i][j] = matrise[i][j] * tall;
			
			}
		}
		return resultat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i].length != b[i].length) {
				return false;
			}

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			} 
		}

		return true;

	}

	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] resultat = new int[matrise[0].length][matrise.length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				resultat[j][i] = matrise[i][j];
			}
		}
		
		return resultat;
	}
	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] resulat = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {

				int sum = 0;

				for (int k = 0; k < a[i].length; k++) {
					sum = sum + a[i][k] * b[k][j];
				}

				resultat[i][j] = sum;
			}
		}
		return resultat;
	}
}
