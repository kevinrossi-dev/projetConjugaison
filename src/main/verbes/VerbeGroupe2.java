package main.verbes;

import main.Verbe;

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

    @Override
    public String terminaison1erePersonneSingulierFutur() {
        return "irai";
    }

    @Override
    public String terminaison2emePersonneSingulierFutur() {
        return "iras";
    }

    @Override
    public String terminaison3emePersonneSingulierFutur() {
        return "iras";
    }

    @Override
    public String terminaison1erePersonnePlurielFutur() {
        return "irons";
    }

    @Override
    public String terminaison2emePersonnePlurielFutur() {
        return "irez";
    }

    @Override
    public String terminaison3emePersonnePlurielFutur() {
        return "iront";
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
        return "i";
    }
}
