package cor.temp;

import main.PasseCompose;
import main.Present;
import main.Temp;

public class PasseComposeCOR extends TempCOR {

    public PasseComposeCOR(TempCOR suivant) {
        super(suivant);
    }

    @Override
    protected Temp determinerTemp2(String temp) {
        try{
            Temp resultat = new PasseCompose(temp);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
