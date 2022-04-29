package main;

public class VerbeGer extends VerbeGroupe1 {

	public VerbeGer(String verbe) {
		super(verbe);
		this.validSuffix(verbe,"ger",2);

	}
	
	public String terminaison1erePersonnePluriel() {
		return "eons";
	}


}
 