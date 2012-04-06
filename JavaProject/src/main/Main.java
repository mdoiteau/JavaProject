package main;

import model.impl.Moto;
import model.impl.Voiture;

public class Main {
	public static void main(String args[]) {
		Voiture v = new Voiture("Ford", 24);
		Moto m = new Moto("Yamaha", 6);
		Moto m2 = new Moto("Kawazaki", 7);
		
		m.demare();
		m2.demare();
		v.demare();
	}
}
