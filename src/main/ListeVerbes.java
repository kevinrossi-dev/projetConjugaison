package main;

import main.personnes.Personne;

import java.util.ArrayList;

public class ListeVerbes {
	public static String[] pronom = { "Je","Tu","Il","Nous","Vous","Ils","En" } ;
	private final ArrayList<Verbe> verbes;
	public ListeVerbes(ArrayList<Verbe> liste){
		this.verbes = liste;
	}

	public String conjugue(Personne a) {
		StringBuffer buffer = new StringBuffer();
		this.verbes.forEach(v ->{
			buffer.append(a.conjugue(v)+'\n'); // On ne touche plus à rien
		});
		return buffer.toString();
	}
	public String conjugue(Temp t) {
		StringBuffer buffer = new StringBuffer();
		this.verbes.forEach(v ->{
			buffer.append(t.conjugue(v)+'\n'); // On ne touche plus à rien
		});
		return buffer.toString();
	}
}
