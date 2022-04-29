package cor.verbe;

import main.Verbe;
import main.VerbeCer;

public class VerbeCerCOR extends VerbeCOR{

    public VerbeCerCOR(VerbeCOR suivant) {
        super(suivant);
    }

    @Override
    protected Verbe determinerGroupe2(String infinitif) {
        try{
            Verbe resultat = new VerbeCer(infinitif);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
