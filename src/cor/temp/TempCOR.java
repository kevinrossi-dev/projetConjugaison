package cor.temp;

import main.Temp;

public abstract class TempCOR implements ITemp {

    public void setSuivant(TempCOR suivant) {
        this.suivant = suivant;
    }

    protected TempCOR suivant;

    public TempCOR(TempCOR suivant){
        this.suivant = suivant;
    }
    @Override
    public Temp determinerTemp(String temp) {
        Temp resultat = this.determinerTemp1(temp);
        if(resultat != null)
            return resultat;
        else
            throw new IllegalArgumentException("Verbe incorrect");
    }

    private Temp determinerTemp1(String temp) {
        Temp resultat = this.determinerTemp2(temp);
        if(resultat != null)
            return resultat;
        else
            if(this.suivant !=null)
                return this.suivant.determinerTemp1(temp);
            else
                return null; // Solution par défaut
    }

    protected abstract Temp determinerTemp2(String infinitif);
}
