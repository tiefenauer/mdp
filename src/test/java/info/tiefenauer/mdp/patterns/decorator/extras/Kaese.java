package info.tiefenauer.mdp.patterns.decorator.extras;

import info.tiefenauer.mdp.patterns.decorator.abstracts.ABeilage;
import info.tiefenauer.mdp.patterns.decorator.interfaces.IGericht;

public class Kaese extends ABeilage {

	public Kaese(IGericht komponente) {
		super(komponente);
		this.description = "Käse";
		this.price = 1.50;
		// TODO Auto-generated constructor stub
	}


}
