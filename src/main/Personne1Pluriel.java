package main;

public class Personne1Pluriel extends Personne{

    @Override
    public String conjugue(Verbe v) {
        return v.conjugue1erePersonnePluriel();
    }
}
