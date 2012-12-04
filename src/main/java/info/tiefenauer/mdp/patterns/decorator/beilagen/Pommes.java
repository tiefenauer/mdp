package info.tiefenauer.mdp.patterns.decorator.beilagen;

import info.tiefenauer.mdp.patterns.decorator.abstracts.ABeilage;
import info.tiefenauer.mdp.patterns.decorator.interfaces.IGericht;

public class Pommes extends ABeilage {

	public Pommes(IGericht komponente) {
		super(komponente);
		this.description = "Pommes";
		this.price = 7.50;
	}

}
