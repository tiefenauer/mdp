package info.tiefenauer.mdp.patterns.decorator.beilagen;

import info.tiefenauer.mdp.patterns.decorator.abstracts.ABeilage;
import info.tiefenauer.mdp.patterns.decorator.interfaces.IGericht;

public class Salat extends ABeilage {

	public Salat(IGericht komponente) {
		super(komponente);
		this.description = "Salat";
		this.price = 4.50;
	}

}
