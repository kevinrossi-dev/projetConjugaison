package cor.temp;

import main.Futur;
import main.Present;
import main.Temp;

public class FuturCOR extends TempCOR {

    public FuturCOR(TempCOR suivant) {
        super(suivant);
    }

    @Override
    protected Temp determinerTemp2(String temp) {
        try{
            Temp resultat = new Futur(temp);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
