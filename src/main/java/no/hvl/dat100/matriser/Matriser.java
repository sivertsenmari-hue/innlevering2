package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for(int i = 0; i < matrise.length; i++){
			for(int j = 0; j < matrise[i].length; j++){
				System.out.print(matrise[i][j] + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String tekst = "";

		for(int i = 0; i < matrise.length; i++){
			for(int j = 0; j < matrise[i].length; j++){
				tekst = tekst + matrise[i][j] + " ";

			}
			tekst = tekst + "\n";
		}
		return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] tallTabell = new int[matrise.length][matrise[0].length];


		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				tallTabell[i][j] = matrise[i][j] * tall;
			}
		}
		return tallTabell;
	}


	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if(a.length != b.length){
			return false;
		}

		for(int i = 0; i < a.length; i++){
			if(a[i].length != b[i].length){
				return false;
			}
			for(int j = 0; j < a[i].length; j++){
				 if(a[i][j] != b[i][j]){
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
