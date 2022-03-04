package cor;

import main.Verbe;

public interface IVerbe {
    /**
     * Lance une IllegalArgument exception si l'infinitif n'est pas reconnu
     * */
    public Verbe determinerGroupe(String infinitif);
}
