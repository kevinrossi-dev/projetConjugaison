package main;

import main.personnes.ParticipePresent;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		ArrayList<Verbe> liste = new ArrayList<Verbe>(Arrays.asList(
				new VerbeGroupe1("marcher"),
				new VerbeGroupe2("finir"),
				new VerbeGer("manger"),
				new VerbeCer("lancer"),
				new VerbeAitre("paraitre"),
				new VerbeOudre("coudre"),
				new VerbeIndre("craindre"),
				new VerbeEttre("mettre"),
				new VerbeSoudre("résoudre")
		));
		ListeVerbes listeVerbes = new ListeVerbes(liste);
		System.out.println(listeVerbes.conjugue(new Present("présent")));

	}

}
