package cor.verbe;

import main.Verbe;
import main.verbes.VerbeGroupe2;

public class VerbeGroupe2COR extends VerbeCOR{

    public VerbeGroupe2COR(VerbeCOR suivant) {
        super(suivant);
    }

    @Override
    protected Verbe determinerGroupe2(String infinitif) {
        try{
            Verbe resultat = new VerbeGroupe2(infinitif);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
