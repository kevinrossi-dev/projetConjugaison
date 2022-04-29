package main;


public class VerbeEttre extends VerbeGroupe3 {

    public VerbeEttre(String verbe) {
        super(verbe);
        this.validSuffix(verbe,"ettre",5);
    }
    @Override
    protected String getParticipePasse() {
        return "is";
    }

    @Override
    public String terminaison1erePersonneSingulier() {
        return "ets";
    }

    @Override
    public String terminaison1erePersonnePluriel() {
        return "ettons";
    }
    @Override
    public String terminaison2emePersonneSingulier() {
        return "ets";
    }

    @Override
    public String terminaison3emePersonneSingulier() {
        return "et";
    }

    @Override
    public String terminaison2emePersonnePluriel() {
        return "ettons";
    }

    @Override
    public String terminaison3emePersonnePluriel() {
        return "ettent";
    }
}
