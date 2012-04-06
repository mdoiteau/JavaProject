package model.impl;


public class Moto extends AbstractVehicule {

	private String marque;
	private int puissanceFiscal;
	
	public Moto(String marque, int puissanceFiscal) {
		this.marque = marque;
		this.puissanceFiscal = puissanceFiscal;
	}
	
	@Override
	public String getName() {
		return "Moto (" + getMarque() + ", " + getPuissanceFiscal() + ")";
	}

	@Override
	public int getNbRoues() {
		return 2;
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
	
	

}
