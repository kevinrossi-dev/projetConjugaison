package cor;

import main.Verbe;
import main.VerbeGer;

public class VerbeGerCOR extends VerbeCOR{

    public VerbeGerCOR(VerbeCOR suivant) {
        super(suivant);
    }

    @Override
    protected Verbe determinerGroupe2(String infinitif) {
        try{
            Verbe resultat = new VerbeGer(infinitif);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
