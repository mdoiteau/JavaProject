package model.impl;

import model.Vehicule;

public abstract class AbstractVehicule implements Vehicule {

	@Override
	public void demare() {
		System.out.println(getName() + " à " + getNbRoues() + "qui démarre");
	}

	@Override
	public void accelere() {
		System.out.println(getName() + " à " + getNbRoues() + "qui accélère");
		
	}

	@Override
	public void freine() {
		System.out.println(getName() + " à " + getNbRoues() + "qui freine");		
	}
	
	public abstract String getName();
	public abstract int getNbRoues();
	
}
