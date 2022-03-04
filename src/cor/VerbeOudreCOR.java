package cor;

import main.Verbe;
import main.VerbeOudre;

public class VerbeOudreCOR extends VerbeCOR{

    public VerbeOudreCOR(VerbeCOR suivant) {
        super(suivant);
    }

    @Override
    protected Verbe determinerGroupe2(String infinitif) {
        try{
            Verbe resultat = new VerbeOudre(infinitif);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
