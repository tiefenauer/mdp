package info.tiefenauer.mdp.patterns.decorator.abstracts;

import info.tiefenauer.mdp.patterns.decorator.interfaces.IGericht;
import info.tiefenauer.mdp.patterns.decorator.interfaces.KomponentenTyp;

public abstract class ABeilage extends AGericht {

	protected IGericht komponente = null;

	public ABeilage(IGericht komponente) {
		super();
		this.typ = KomponentenTyp.BEILAGE;
		this.komponente = komponente;
	}

	public double getPrice() {
		return (komponente != null)?komponente.getPrice() + this.price:this.price;
	}
	
	public String getDescription() {
		return (komponente != null)?komponente.getDescription() + ", " + this.description:this.description;
	}
}
