package main;

public class VerbeGroupe2 extends Verbe {

    public VerbeGroupe2(String verbe) {
        super(verbe);
        this.validSuffix(verbe, "ir", 2);

    }

    public String terminaison1erePersonneSingulier() {
        return "is";
    }

    @Override
    public String terminaison2emePersonneSingulier() {
        return "is";
    }

    @Override
    public String terminaison3emePersonneSingulier() {
        return "it";
    }

    public String terminaison1erePersonnePluriel() {
        return "issons";
    }

    @Override
    public String terminaison2emePersonnePluriel() {
        return "issez";
    }

    @Override
    public String terminaison3emePersonnePluriel() {
        return "issent";
    }

    public String getParticipePasse() {
        return "i";
    }
}
