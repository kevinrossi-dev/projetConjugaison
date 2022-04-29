package cor.verbe;

import main.Verbe;
import main.VerbeSoudre;

public class VerbeSoudreCOR extends VerbeCOR{

    public VerbeSoudreCOR(VerbeCOR suivant) {
        super(suivant);
    }

    @Override
    protected Verbe determinerGroupe2(String infinitif) {
        try{
            Verbe resultat = new VerbeSoudre(infinitif);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
