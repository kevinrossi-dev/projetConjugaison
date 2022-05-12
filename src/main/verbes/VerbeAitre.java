package main.verbes;


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
	@Override
	public String terminaison2emePersonneSingulier() {
		return "ais";
	}

	@Override
	public String terminaison3emePersonneSingulier() {
		return "ait";
	}

	@Override
	public String terminaison2emePersonnePluriel() {
		return "aissez";
	}

	@Override
	public String terminaison3emePersonnePluriel() {
		return "aissent";
	}

	@Override
	public String terminaison1erePersonneSingulierFutur() {
		return "aîtrai";
	}

	@Override
	public String terminaison2emePersonneSingulierFutur() {
		return "aîtras";
	}

	@Override
	public String terminaison3emePersonneSingulierFutur() {
		return "aîtra";
	}

	@Override
	public String terminaison1erePersonnePlurielFutur() {
		return "aîtrons";
	}

	@Override
	public String terminaison2emePersonnePlurielFutur() {
		return "aîtrez";
	}

	@Override
	public String terminaison3emePersonnePlurielFutur() {
		return "aîtront";
	}



}
