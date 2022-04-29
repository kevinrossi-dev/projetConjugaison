package main;

public class VerbeSoudre extends VerbeGroupe3 {

	public VerbeSoudre(String verbe) {
		super(verbe);
		this.validSuffix(verbe,"soudre",4);
	}
	@Override
	protected String getParticipePasse() {
		return "lu";
	}

	@Override
	public String terminaison1erePersonneSingulier() {
		return "us";
	}

	@Override
	public String terminaison1erePersonnePluriel() {
		return "lvons";
	}
	@Override
	public String terminaison2emePersonneSingulier() {
		return "us";
	}

	@Override
	public String terminaison3emePersonneSingulier() {
		return "ut";
	}

	@Override
	public String terminaison2emePersonnePluriel() {
		return "lvez";
	}

	@Override
	public String terminaison3emePersonnePluriel() {
		return "lvent";
	}
}
