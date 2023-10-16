public class Kladionicar {    		
			
	private String ime;
	private String igra;
	private int racun;

	public Kladionicar(String novoIme, String novaIgra, int noviRacun) {
		this.ime = novoIme;
		this.racun = noviRacun;

		if (novaIgra.equals("poker") || novaIgra.equals("ajnc") || novaIgra.equals("rulet")) {
			this.igra = novaIgra;
		} else {
			this.igra = "poker";
		}
		// if (novaIgra.equals("poker")) {
		// 	this.igra = "poker";
		// } else if (novaIgra.equals("ajnc")) {
		// 	this.igra = "ajnc";
		// } else if (novaIgra.equals("rulet")) {
		// 	this.igra = "rulet";
		// } else {
		// 	this.igra = "poker";
		// }
	}

	public void setIme(String novoIme) {
		this.ime = novoIme;
	}

	public void setIgra(String novaIgra) {
		if (novaIgra.equals("poker")) {
			this.igra = "poker";
		} else if (novaIgra.equals("ajnc")) {
			this.igra = "ajnc";
		} else if (novaIgra.equals("rulet")) {
			this.igra = "rulet";
		} else {
			this.igra = "poker";
		}
	}
		
    public void setRacun(int noviRacun) {
    	this.racun = noviRacun;
    }
	public String getIme() {
		return ime;
	}
	public String getIgru() {
		return igra;
	}
	public int getRacun() {
		return racun;
	}
    
    public String toString() {
    	return ime + " igra " + igra + " i ima " + racun + " na racunu";
    }
}
