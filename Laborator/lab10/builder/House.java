package lab10.builder;

import java.util.ArrayList;

public class House {

	// TODO: write optional and mandatory facilities to have in a house - DONE
	private String locatie;
	private Integer etaje;
	private String incalzire;
	private Integer nrCamere;
	private int electrocasnice;
	private int piscina;
	private int panouriSolare;
	private int securitate;

	// TODO: complete the private constructor - DONE
	private House(HouseBuilder builder) {
		this.locatie = builder.locatie;
		this.etaje = builder.etaje;
		this.incalzire = builder.incalzire;
		this.nrCamere = builder.nrCamere;
		this.electrocasnice = builder.electrocasnice;
		this.piscina = builder.piscina;
		this.panouriSolare = builder.panouriSolare;
		this.securitate = builder.securitate;
	}

	// TODO: generate getters - DONE

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public Integer getEtaje() {
		return etaje;
	}

	public void setEtaje(Integer etaje) {
		this.etaje = etaje;
	}

	public String getIncalzire() {
		return incalzire;
	}

	public void setIncalzire(String incalzire) {
		this.incalzire = incalzire;
	}

	public Integer getNrCamere() {
		return nrCamere;
	}

	public void setNrCamere(Integer nrCamere) {
		this.nrCamere = nrCamere;
	}

	public int getElectrocasnice() {
		return electrocasnice;
	}

	public void setElectrocasnice(int electrocasnice) {
		this.electrocasnice = electrocasnice;
	}

	public int getPiscina() {
		return piscina;
	}

	public void setPiscina(int piscina) {
		this.piscina = piscina;
	}

	public int getPanouriSolare() {
		return panouriSolare;
	}

	public void setPanouriSolare(int panouriSolare) {
		this.panouriSolare = panouriSolare;
	}

	public int getSecuritate() {
		return securitate;
	}

	public void setSecuritate(int securitate) {
		this.securitate = securitate;
	}


	// TODO: override toString method - DONE


	@Override
	public String toString() {
		return "House{" +
				"locatie='" + locatie + '\'' +
				", etaje=" + etaje +
				", incalzire='" + incalzire + '\'' +
				", nrCamere=" + nrCamere +
				", electrocasnice=" + electrocasnice +
				", piscina=" + piscina +
				", panouriSolare=" + panouriSolare +
				", securitate=" + securitate +
				'}';
	}

	public static class HouseBuilder {

		// TODO: write same facilities - DONE
		private String locatie;
		private Integer etaje;
		private String incalzire;
		private Integer nrCamere;
		private int electrocasnice = 0;
		private int piscina = 0;
		private int panouriSolare = 0;
		private int securitate = 0;


		// TODO: complete the house builder constructor only with the mandatory facilities - DONE
		public HouseBuilder(String locatie, Integer etaje, String incalzire, Integer nrCamere) {
			this.locatie = locatie;
			this.etaje = etaje;
			this.incalzire = incalzire;
			this.nrCamere = nrCamere;
		}

		// TODO: add the optional facilities in a builder design - DONE
		public HouseBuilder electrocasnice(int electrocasnice){
			this.electrocasnice = electrocasnice;
			return this;
		}

		public HouseBuilder piscina(int piscina){
			this.piscina = piscina;
			return this;
		}

		public HouseBuilder panouriSolare(int panouriSolare){
			this.panouriSolare = panouriSolare;
			return this;
		}

		public HouseBuilder securitate(int securitate){
			this.securitate = securitate;
			return this;
		}

		// TODO: complete the final build method - DONE
		public House build() {
			return new House(this);
		}

		// TODO: test functionality in a Main class
	}
}
