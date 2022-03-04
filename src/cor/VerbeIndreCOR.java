package cor;

import main.Verbe;
import main.VerbeIndre;

public class VerbeIndreCOR extends VerbeCOR{

    public VerbeIndreCOR(VerbeCOR suivant) {
        super(suivant);
    }

    @Override
    protected Verbe determinerGroupe2(String infinitif) {
        try{
            Verbe resultat = new VerbeIndre(infinitif);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
