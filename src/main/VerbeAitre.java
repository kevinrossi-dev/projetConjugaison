package main;


public class VerbeAitre extends VerbeGroupe3 {

	public VerbeAitre(String verbe) {
		super(verbe);
		this.validSuffix(verbe,"aitre",5);
	}
	@Override
	protected String getParticipePasse() {
		return "u";
	}

	@Override
	public String terminaison1erePersonneSingulier() {
		return "ais";
	}

	@Override
	public String terminaison1erePersonnePluriel() {
		return "aissons";
	}

}
