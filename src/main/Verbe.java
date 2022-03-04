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
	
	public abstract String terminaison1erePersonneSingulier();
	public abstract String terminaison1erePersonnePluriel();


}
