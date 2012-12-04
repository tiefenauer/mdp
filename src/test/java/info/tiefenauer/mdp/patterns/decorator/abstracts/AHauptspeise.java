package info.tiefenauer.mdp.patterns.decorator.abstracts;

import info.tiefenauer.mdp.patterns.decorator.interfaces.KomponentenTyp;

public abstract class AHauptspeise extends AGericht {

	public AHauptspeise() {
		this.typ = KomponentenTyp.HAUPTSPEISE;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getDescription() {
		return this.description;
	}

}
