package model.impl;

import model.Vehicule;

public abstract class AbstractVehicule implements Vehicule {

	@Override
	public void demare() {
		System.out.println(getName() + " qui d�marre");
	}

	@Override
	public void accelere() {
		System.out.println(getName() + " qui acc�l�re");
		
	}

	@Override
	public void freine() {
		System.out.println(getName() + " qui freine");		
	}
	
	public abstract String getName();
	
}
