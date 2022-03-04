package cor;

import main.Verbe;

public abstract class VerbeCOR implements IVerbe {

    public void setSuivant(VerbeCOR suivant) {
        this.suivant = suivant;
    }

    protected VerbeCOR suivant;

    public VerbeCOR(VerbeCOR suivant){
        this.suivant = suivant;
    }
    @Override
    public Verbe determinerGroupe(String infinitif) {
        Verbe resultat = this.determinerGroupe1(infinitif);
        if(resultat != null)
            return resultat;
        else
            throw new IllegalArgumentException("Verbe incorrect");
    }

    private Verbe determinerGroupe1(String infinitif) {
        Verbe resultat = this.determinerGroupe2(infinitif);
        if(resultat != null)
            return resultat;
        else
            if(this.suivant !=null)
                return this.suivant.determinerGroupe1(infinitif);
            else
                return null; // Solution par défaut
    }

    protected abstract Verbe determinerGroupe2(String infinitif);
}
