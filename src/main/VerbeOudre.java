package main;

public class VerbeOudre extends VerbeGroupe3 {

	public VerbeOudre(String verbe) {
		super(verbe);
		this.validSuffix(verbe,"oudre",3);
	}
	@Override
	protected String getParticipePasse() {
		return "su";
	}

	@Override
	public String terminaison1erePersonneSingulier() {
		return "ds";
	}

	@Override
	public String terminaison1erePersonnePluriel() {
		return "sons";
	}

}
