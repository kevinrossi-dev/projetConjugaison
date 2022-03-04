package main;

public class VerbeGroupe2 extends Verbe{
	
	public VerbeGroupe2(String verbe) {
		super(verbe);
		this.validSuffix(verbe,"ir",2);

	}

	public String terminaison1erePersonneSingulier() {
		return "is";
	}
	public String terminaison1erePersonnePluriel() {
		return "issons";
	}
	public String getParticipePasse() {
		return "i";
	}
}
