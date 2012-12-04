package info.tiefenauer.mdp.patterns.decorator.beilagen;

import info.tiefenauer.mdp.patterns.decorator.abstracts.ABeilage;
import info.tiefenauer.mdp.patterns.decorator.interfaces.IGericht;

public class Nudeln extends ABeilage {

	public Nudeln(IGericht komponente) {
		super(komponente);
		this.description = "Nudeln";
		this.price = 9.50;
	}

}
