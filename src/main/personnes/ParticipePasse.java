package main.personnes;

import main.Verbe;

public class ParticipePasse extends Personne{


    @Override
    public String conjugue(Verbe v) {
        return v.conjugueParticipePasse();
    }
}
