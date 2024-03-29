package cor.verbe;

import main.Verbe;
import main.verbes.VerbeEttre;

public class VerbeEttreCOR extends VerbeCOR{

    public VerbeEttreCOR(VerbeCOR suivant) {
        super(suivant);
    }

    @Override
    protected Verbe determinerGroupe2(String infinitif) {
        try{
            Verbe resultat = new VerbeEttre(infinitif);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
