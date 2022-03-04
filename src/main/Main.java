package main;

import cor.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		ArrayList<Verbe> liste = new ArrayList<Verbe>(Arrays.asList(new VerbeGroupe1("manger"),new VerbeGroupe2("finir"),new VerbeSoudre("résoudre")));
		ListeVerbes listeVerbes = new ListeVerbes(liste);
		System.out.println(listeVerbes.conjugue(new ParticipePasse()));

	}

}
