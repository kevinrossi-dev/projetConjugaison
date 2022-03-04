package main;

import cor.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCOR {
    public static void main(String[] args) throws IOException {

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

        while(true) {
            System.out.println("Tapez le verbe à conjuguer");
            BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
            String infinitif = clavier.readLine().trim();
            Verbe verbe = iVerbe.determinerGroupe(infinitif);

            System.out.println(verbe.conjugue1erePersonneSingulier());
            System.out.println(verbe.conjugue1erePersonnePluriel());
            System.out.println(verbe.conjugueParticipePresent());
            System.out.println(verbe.conjugueParticipePasse());
        }
    }
}
