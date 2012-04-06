package model.impl;


public  class Voiture extends  AbstractVehicule {

	private String marque;
	private int puissanceFiscal;
	
	public Voiture(String marque, int puissanceFiscal) {
		this.marque = marque;
		this.puissanceFiscal = puissanceFiscal;
	}
	
	@Override
	public String getName() {
		return "BAR (" + getMarque() + ", " + getPuissanceFiscal() + ")";
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getPuissanceFiscal() {
		return puissanceFiscal;
	}

	public void setPuissanceFiscal(int puissanceFiscal) {
		this.puissanceFiscal = puissanceFiscal;
	}
	

	@Override
	public int getNbRoues() {
		return 4;
	}

}
