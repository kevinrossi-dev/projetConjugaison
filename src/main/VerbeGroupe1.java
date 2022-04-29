package main;

public class VerbeGroupe1 extends Verbe {

    public VerbeGroupe1(String verbe) {
        super(verbe);
        this.validSuffix(verbe, "er", 2);
    }

    public String terminaison1erePersonnePluriel() {
        return "ons";
    }
    public String terminaison2emePersonnePluriel() {
        return "ez";
    }
    public String terminaison3emePersonnePluriel() {
        return "ent";
    }
    public String terminaison1erePersonneSingulier() {
        return "e";
    }
    public String terminaison2emePersonneSingulier() {
        return "es";
    }
    public String terminaison3emePersonneSingulier() {
        return "e";
    }


    public String getParticipePasse() {
        return "é";
    }
}
