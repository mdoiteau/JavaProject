package main;

import model.impl.Moto;
import model.impl.Voiture;

public class Main {
	public static void main(String args) {
		Voiture v = new Voiture();
		Moto m = new Moto();
		
		m.demare();
		v.demare();
	}
}
