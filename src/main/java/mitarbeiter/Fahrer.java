package mitarbeiter;

import java.io.Serializable;

public class Fahrer extends SchichtArbeiter implements Serializable {
	private String fuehrerSchein;
	private static String[] gueltigeKlassen= {"B","C","D"};

	public String getFuehrerSchein() {
		return fuehrerSchein;
	}

	public void setFuehrerSchein(String fuehrerSchein) {
		boolean gueltig = false;
		for(int i =0; i< gueltigeKlassen.length;i++) {
			if(gueltigeKlassen[i].equals(fuehrerSchein) ) {
				this.fuehrerSchein = fuehrerSchein;
				gueltig = true;
			}
		}
		if(!gueltig)
			throw new IllegalArgumentException( fuehrerSchein + "-Klasse nicht g�ltig.");
	}

	public Fahrer(int id, String name, double satz, String fuehrerSchein) throws IllegalArgumentException {
		super(id, name, satz);
		this.setFuehrerSchein(fuehrerSchein);
	}
	public String toString() {
		return "Fahrer "+ super.toString() + " hat F�hrerscheinklasse " + this.fuehrerSchein;
	}

}
