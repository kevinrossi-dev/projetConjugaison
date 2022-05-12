package cor.verbe;

import main.Verbe;
import main.verbes.VerbeAitre;

public class VerbeAitreCOR extends VerbeCOR{

    public VerbeAitreCOR(VerbeCOR suivant) {
        super(suivant);
    }

    @Override
    protected Verbe determinerGroupe2(String infinitif) {
        try{
            Verbe resultat = new VerbeAitre(infinitif);
            return resultat;
        }catch(IllegalArgumentException ex){
            return null;
        }
    }
}
