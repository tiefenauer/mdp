package info.tiefenauer.mdp.patterns.decorator.beilagen;

import info.tiefenauer.mdp.patterns.decorator.abstracts.ABeilage;
import info.tiefenauer.mdp.patterns.decorator.interfaces.IGericht;

public class Bohnen extends ABeilage {

	public Bohnen(IGericht komponente) {
		super(komponente);
		this.description = "Bohnen";
		this.price = 5.75;
	}

}
