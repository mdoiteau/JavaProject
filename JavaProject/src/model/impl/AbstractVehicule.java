package model.impl;

import model.Vehicule;

public abstract class AbstractVehicule implements Vehicule {

	@Override
	public void demare() {
		System.out.println(getName() + " � " + getNbRoues() + "qui d�marre");
	}

	@Override
	public void accelere() {
		System.out.println(getName() + " � " + getNbRoues() + "qui acc�l�re");
		
	}

	@Override
	public void freine() {
		System.out.println(getName() + " � " + getNbRoues() + "qui freine");		
	}
	
	public abstract String getName();
	public abstract int getNbRoues();
	
}
