package cor.verbe;

import main.Verbe;

public interface IVerbe {
    /**
     * Lance une IllegalArgument exception si l'infinitif n'est pas reconnu
     * */
    Verbe determinerGroupe(String infinitif);
}
