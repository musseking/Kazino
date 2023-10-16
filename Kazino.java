import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kazino {
	
	private Kladionicar[] nizKladionicara;

	public Kazino(Kladionicar[] noviNizKladionicara) {
		this.nizKladionicara = noviNizKladionicara;
	}
	

	@Override
	public String toString() {

		String result = "";
		for (Kladionicar k : nizKladionicara)
			result += k + "\n";
		return result;
 	}

	//Mišin metod:
	private int findIndexOfMaximum(int[] prosledjeniNiz) {
		int maxIndex = 0;
		for (int i = 0; i < prosledjeniNiz.length; ++i) {
			if (prosledjeniNiz[i] > prosledjeniNiz[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	//Mišin metod:
	public String najprofitnijaIgra() {

		String[] igre = {"poker", "ajnc", "rulet"};
		int[] stanja = {0, 0, 0};

		for (Kladionicar k : nizKladionicara) {
			if (k.getRacun() >= 0)
				continue;

			stanja[Arrays.asList(igre).indexOf(k.getIgru())]++;
		}

		String najprofitabilnijaIgra = igre[findIndexOfMaximum(stanja)];
		return String.format("Najprofitabilnija igra je trenutno %s.", najprofitabilnijaIgra);
	}

	public String theMostProfitabileGame(Kladionicar[] proslednjeniNiz) {

		String result = "";
		List<String> list = new ArrayList<>();

		for (int i = 0; i < proslednjeniNiz.length; ++i) {
			if (proslednjeniNiz[i].getRacun() < 0)
				list.add(proslednjeniNiz[i].getIgru());
			else
				continue;
		}

		result += list.get(0);

		return "Trenutno najprofitabilnija igra je " + result + ".";
	}
}