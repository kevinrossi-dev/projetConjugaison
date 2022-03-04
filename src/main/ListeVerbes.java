package main;

import java.util.ArrayList;

public class ListeVerbes {
	public static String[] pronom = { "Je","Tu","Il","Nous","Vous","Ils","En" } ; 
	private ArrayList<Verbe> verbes;
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

}
