package implementsInterfaces;

import cor.temp.FuturCOR;
import cor.temp.ITemp;
import cor.temp.PasseComposeCOR;
import cor.temp.PresentCOR;
import cor.verbe.*;
import interfaces.ConjugaisonInterface;
import main.Temp;
import main.Verbe;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConjugaisonImplement extends UnicastRemoteObject implements ConjugaisonInterface {

    public ConjugaisonImplement() throws RemoteException {
    }

    @Override
    public String conjuguer(String tempEtVerbe) {
        String[] array = tempEtVerbe.split(",");
        String verbeInfinitf = array[0];
        String tempString = array[1];

        VerbeCOR verbeOudre = new VerbeOudreCOR(null);
        VerbeCOR verbeSoudre = new VerbeSoudreCOR(verbeOudre);
        VerbeCOR verbeAitre = new VerbeAitreCOR(verbeSoudre);
        VerbeCOR verbeGroupe2 = new VerbeGroupe2COR(verbeAitre);
        VerbeCOR verbeGroupe1 = new VerbeGroupe1COR(verbeGroupe2);
        VerbeCOR verbeCer = new VerbeCerCOR(verbeGroupe1);
        VerbeCOR verbeGer = new VerbeGerCOR(verbeCer);
        VerbeCOR verbeIndre = new VerbeIndreCOR(verbeGer);
        VerbeCOR verbeEttre = new VerbeEttreCOR(verbeIndre);
        IVerbe iVerbe = verbeEttre;
        PasseComposeCOR passeComposeCOR = new PasseComposeCOR(null);
        FuturCOR futurCOR = new FuturCOR(passeComposeCOR);
        PresentCOR presentCOR = new PresentCOR(futurCOR);
        ITemp iTemp = presentCOR;

        Verbe verbe = iVerbe.determinerGroupe(verbeInfinitf);
        Temp temp = iTemp.determinerTemp(tempString);
        return temp.conjugue(verbe);
    }
}
