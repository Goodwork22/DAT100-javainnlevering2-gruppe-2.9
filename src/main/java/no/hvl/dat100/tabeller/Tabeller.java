package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tekst = "[";
		for (int i = 0; i < tabell.length; i++) {
			tekst += tabell[i];

			if (i > 0) {
				tekst += ",";
			}
		}
		tekst += "]";
		return tekst;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int verdi : tabell) {
			sum += verdi;
		}
		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for(int verdi : tabell) {
			if (verdi == tall){
				return true;
			}
		}
		return false;
		}



	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int posisjon = 0;
		for(int verdi : tabell){
			if(verdi == tall) {
				return posisjon;
			}
			posisjon = posisjon + 1;

		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reverserttabell = new int[tabell.length];

		for(int i = 0; i < tabell.length;) {
			reverserttabell[i] = tabell[tabell.length - 1 - i];
			i++;
		}
		return reverserttabell;

	}
	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] samensatttabell = new int[tabell1.length + tabell2.length];
		System.arraycopy(tabell1,0 ,samensatttabell , 0, tabell1.length);
		System.arraycopy(tabell2 , 0, samensatttabell, tabell1.length ,tabell2.length);
		return samensatttabell;



	}
}
