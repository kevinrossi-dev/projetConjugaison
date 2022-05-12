package main;

public abstract class Verbe {
	private String radical;

	public String getRadical() {
		return radical;
	}

	public void setRadical(String radical) {
		this.radical = radical;
	}


	public Verbe(String verbe) {
	}
	public boolean validSuffix(String verbe , String suffix , Integer suffixIndex)
	{
		int length = verbe.length();
		int suffixLength = suffix.length();
		if(length<suffixLength)
			throw new IllegalArgumentException();
		this.setRadical(verbe.substring(0,length-suffixIndex));
		if(!verbe.endsWith(suffix))
			throw new IllegalArgumentException(verbe+" ne fini pas par -"+suffix);
		return true;
	}
	
	public String conjugue1erePersonneSingulier() {
		return ListeVerbes.pronom[0]+" "+this.getRadical()+this.terminaison1erePersonneSingulier();
	}
	public String conjugue1erePersonnePluriel() {
		return ListeVerbes.pronom[3]+" "+this.getRadical()+this.terminaison1erePersonnePluriel();
	}

	public String conjugue2emePersonneSingulier() {
		return ListeVerbes.pronom[1]+" "+this.getRadical()+this.terminaison2emePersonneSingulier();
	}
	public String conjugue2emePersonnePluriel() {
		return ListeVerbes.pronom[4]+" "+this.getRadical()+this.terminaison2emePersonnePluriel();
	}

	public String conjugue3emePersonneSingulier() {
		return ListeVerbes.pronom[2]+" "+this.getRadical()+this.terminaison3emePersonneSingulier();
	}

	public String conjugue3emePersonnePluriel() {
		return ListeVerbes.pronom[5]+" "+this.getRadical()+this.terminaison3emePersonnePluriel();
	}


	public String conjugueParticipePresent() {
		return ListeVerbes.pronom[6]+" "+this.getParticipePresent();
	}
	
	public String conjugueParticipePasse() {
		return this.getRadical()+this.getParticipePasse();
	}
	
	protected abstract String getParticipePasse();

	public String getParticipePresent() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.conjugue1erePersonnePluriel().substring(4).trim());
		sb.replace(sb.length()-3, sb.length(), "ant");
		return sb.toString();
	}
	/*
	PRESENT
	 */
	public abstract String terminaison1erePersonneSingulier();
	public abstract String terminaison2emePersonneSingulier();
	public abstract String terminaison3emePersonneSingulier();
	public abstract String terminaison1erePersonnePluriel();
	public abstract String terminaison2emePersonnePluriel();
	public abstract String terminaison3emePersonnePluriel();

	/*
	FUTUR
	 */
	public abstract String terminaison1erePersonneSingulierFutur();
	public abstract String terminaison2emePersonneSingulierFutur();
	public abstract String terminaison3emePersonneSingulierFutur();
	public abstract String terminaison1erePersonnePlurielFutur();
	public abstract String terminaison2emePersonnePlurielFutur();
	public abstract String terminaison3emePersonnePlurielFutur();

	public String conjugue1erePersonneSingulierFutur() {
		return ListeVerbes.pronom[0]+" "+this.getRadical()+this.terminaison1erePersonneSingulierFutur();
	}
	public String conjugue1erePersonnePlurielFutur() {
		return ListeVerbes.pronom[3]+" "+this.getRadical()+this.terminaison1erePersonnePlurielFutur();
	}

	public String conjugue2emePersonneSingulierFutur() {
		return ListeVerbes.pronom[1]+" "+this.getRadical()+this.terminaison2emePersonneSingulierFutur();
	}
	public String conjugue2emePersonnePlurielFutur() {
		return ListeVerbes.pronom[4]+" "+this.getRadical()+this.terminaison2emePersonnePlurielFutur();
	}

	public String conjugue3emePersonneSingulierFutur() {
		return ListeVerbes.pronom[2]+" "+this.getRadical()+this.terminaison3emePersonneSingulierFutur();
	}

	public String conjugue3emePersonnePlurielFutur() {
		return ListeVerbes.pronom[5]+" "+this.getRadical()+this.terminaison3emePersonnePlurielFutur();
	}

	/*
	PASSE COMPOSE
	 */

	public abstract String terminaison1erePersonneSingulierPasseCompose();
	public abstract String terminaison2emePersonneSingulierPasseCompose();
	public abstract String terminaison3emePersonneSingulierPasseCompose();
	public abstract String terminaison1erePersonnePlurielPasseCompose();
	public abstract String terminaison2emePersonnePlurielPasseCompose();
	public abstract String terminaison3emePersonnePlurielPasseCompose();

	public String conjugue1erePersonneSingulierPasseCompose() {
		return "J'ai "+this.getRadical()+this.getParticipePasse()+this.terminaison1erePersonneSingulierPasseCompose();
	}
	public String conjugue1erePersonnePlurielPasseCompose() {
		return ListeVerbes.pronom[3]+" avons "+this.getRadical()+this.getParticipePasse()+this.terminaison1erePersonnePlurielPasseCompose();
	}

	public String conjugue2emePersonneSingulierPasseCompose() {
		return ListeVerbes.pronom[1]+" as "+this.getRadical()+this.getParticipePasse()+this.terminaison2emePersonneSingulierPasseCompose();
	}
	public String conjugue2emePersonnePlurielPasseCompose() {
		return ListeVerbes.pronom[4]+" avez "+this.getRadical()+this.getParticipePasse()+this.terminaison2emePersonnePlurielPasseCompose();
	}

	public String conjugue3emePersonneSingulierPasseCompose() {
		return ListeVerbes.pronom[2]+" a "+this.getRadical()+this.getParticipePasse()+this.terminaison3emePersonneSingulierPasseCompose();
	}

	public String conjugue3emePersonnePlurielPasseCompose() {
		return ListeVerbes.pronom[5]+" ont "+this.getRadical()+this.getParticipePasse()+this.terminaison3emePersonnePlurielPasseCompose();
	}

}
