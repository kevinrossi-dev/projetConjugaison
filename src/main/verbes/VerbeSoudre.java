package main.verbes;

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

	@Override
	public String terminaison1erePersonneSingulierFutur() {
		return "udrai";
	}

	@Override
	public String terminaison2emePersonneSingulierFutur() {
		return "udras";
	}

	@Override
	public String terminaison3emePersonneSingulierFutur() {
		return "udra";
	}

	@Override
	public String terminaison1erePersonnePlurielFutur() {
		return "udrons";
	}

	@Override
	public String terminaison2emePersonnePlurielFutur() {
		return "udrez";
	}

	@Override
	public String terminaison3emePersonnePlurielFutur() {
		return "udront";
	}
}
