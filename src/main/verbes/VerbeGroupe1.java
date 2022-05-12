package main.verbes;

import main.Verbe;

public class VerbeGroupe1 extends Verbe {

    public VerbeGroupe1(String verbe) {
        super(verbe);
        this.validSuffix(verbe, "er", 2);
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

    public String terminaison1erePersonnePluriel() {
        return "ons";
    }

    public String terminaison2emePersonnePluriel() {
        return "ez";
    }

    public String terminaison3emePersonnePluriel() {
        return "ent";
    }

    @Override
    public String terminaison1erePersonneSingulierFutur() {
        return "erai";
    }

    @Override
    public String terminaison2emePersonneSingulierFutur() {
        return "eras";
    }

    @Override
    public String terminaison3emePersonneSingulierFutur() {
        return "era";
    }

    @Override
    public String terminaison1erePersonnePlurielFutur() {
        return "erons";
    }

    @Override
    public String terminaison2emePersonnePlurielFutur() {
        return "erez";
    }

    @Override
    public String terminaison3emePersonnePlurielFutur() {
        return "eront";
    }

    @Override
    public String terminaison1erePersonneSingulierPasseCompose() {
        return "";
    }

    @Override
    public String terminaison2emePersonneSingulierPasseCompose() {
        return "";
    }

    @Override
    public String terminaison3emePersonneSingulierPasseCompose() {
        return "";
    }

    @Override
    public String terminaison1erePersonnePlurielPasseCompose() {
        return "";
    }

    @Override
    public String terminaison2emePersonnePlurielPasseCompose() {
        return "";
    }

    @Override
    public String terminaison3emePersonnePlurielPasseCompose() {
        return "";
    }


    public String getParticipePasse() {
        return "é";
    }
}
