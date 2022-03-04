package main;

public class VerbeGroupe3 extends Verbe{

	public VerbeGroupe3(String verbe) {
		super(verbe);
	}

	@Override
	protected String getParticipePasse() {
		return "u";
	}

	@Override
	public String terminaison1erePersonneSingulier() {
		return "";
	}

	@Override
	public String terminaison1erePersonnePluriel() {
		return "";
	}

	

}
