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
	@Override
	public String terminaison2emePersonneSingulier() {
		return "ds";
	}

	@Override
	public String terminaison3emePersonneSingulier() {
		return "d";
	}

	@Override
	public String terminaison2emePersonnePluriel() {
		return "sez";
	}

	@Override
	public String terminaison3emePersonnePluriel() {
		return "sent";
	}
}
