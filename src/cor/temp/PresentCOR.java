package cor.temp;

import cor.verbe.VerbeCOR;
import main.Present;
import main.Temp;

public class PresentCOR extends TempCOR {

    public PresentCOR(TempCOR suivant) {
        super(suivant);
    }

    @Override
    protected Temp determinerTemp2(String temp) {
        try{
            Temp resultat = new Present(temp);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
