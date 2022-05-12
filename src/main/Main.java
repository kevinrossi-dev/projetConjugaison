package main;

import implementsInterfaces.ConjugaisonImplement;
import interfaces.ConjugaisonInterface;
import main.verbes.*;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		try {
			System.setProperty("java.rmi.server.hostname", "localhost");
			LocateRegistry.createRegistry(2000);
			ConjugaisonImplement obj = new ConjugaisonImplement();
			Naming.rebind("rmi://localhost:2000/conjugaison", obj);

		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
