package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for(int [] rad :matrise){
			for( int tall : rad){
				System.out.println(tall + " ");
			}
		System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
			String resultat = "";

			for (int i = 0; i < matrise.length; i++) {
				for (int j = 0; j < matrise[i].length; j++) {
					resultat += matrise[i][j] + " ";
				}
				resultat += "\n";
			}

			return resultat;
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

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
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
