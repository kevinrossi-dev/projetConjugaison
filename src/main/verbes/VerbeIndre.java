package main.verbes;

public class VerbeIndre extends VerbeGroupe3 {

	public VerbeIndre(String verbe) {
		super(verbe);
		this.validSuffix(verbe,"indre",4);


	}
	@Override
	protected String getParticipePasse() {
		return "nt";
	}

	@Override
	public String terminaison1erePersonneSingulier() {
		return "ns";
	}

	@Override
	public String terminaison1erePersonnePluriel() {
		return "gnons";
	}

	@Override
	public String terminaison2emePersonneSingulier() {
		return "ns";
	}

	@Override
	public String terminaison3emePersonneSingulier() {
		return "nt";
	}

	@Override
	public String terminaison2emePersonnePluriel() {
		return "gnez";
	}

	@Override
	public String terminaison3emePersonnePluriel() {
		return "gnent";
	}
	@Override
	public String terminaison1erePersonneSingulierFutur() {
		return "ndrai";
	}

	@Override
	public String terminaison2emePersonneSingulierFutur() {
		return "ndras";
	}

	@Override
	public String terminaison3emePersonneSingulierFutur() {
		return "ndra";
	}

	@Override
	public String terminaison1erePersonnePlurielFutur() {
		return "ndrons";
	}

	@Override
	public String terminaison2emePersonnePlurielFutur() {
		return "ndrez";
	}

	@Override
	public String terminaison3emePersonnePlurielFutur() {
			return "ndront";
	}
}
