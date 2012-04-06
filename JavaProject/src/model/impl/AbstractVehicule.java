package model.impl;

import model.Vehicule;

public abstract class AbstractVehicule implements Vehicule {

	@Override
	public void demare() {
		System.out.println(getName() + " qui démarre");
	}

	@Override
	public void accelere() {
		System.out.println(getName() + " qui accélère");
		
	}

	@Override
	public void freine() {
		System.out.println(getName() + " qui freine");		
	}
	
	public abstract String getName();
	
}
