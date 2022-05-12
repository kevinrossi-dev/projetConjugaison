package cor.verbe;

import main.Verbe;
import main.verbes.VerbeGroupe1;

public class VerbeGroupe1COR extends VerbeCOR{

    public VerbeGroupe1COR(VerbeCOR suivant) {
        super(suivant);
    }

    @Override
    protected Verbe determinerGroupe2(String infinitif) {
        try{
            Verbe resultat = new VerbeGroupe1(infinitif);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
