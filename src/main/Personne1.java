package main;

public class Personne1 extends Personne {
    @Override
    public String conjugue(Verbe v) {
        return v.conjugue1erePersonneSingulier();
    }
}
