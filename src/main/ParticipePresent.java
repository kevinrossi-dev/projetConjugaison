package main;

public class ParticipePresent extends Personne {
    @Override
    public String conjugue(Verbe v) {
        return v.conjugueParticipePresent();
    }
}
