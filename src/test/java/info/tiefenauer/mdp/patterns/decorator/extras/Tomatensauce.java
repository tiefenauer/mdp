package info.tiefenauer.mdp.patterns.decorator.extras;

import info.tiefenauer.mdp.patterns.decorator.abstracts.ABeilage;
import info.tiefenauer.mdp.patterns.decorator.interfaces.IGericht;

public class Tomatensauce extends ABeilage {

	public Tomatensauce(IGericht komponente) {
		super(komponente);
		this.description = "Tomatensauce";
		this.price = 2.50;
	}


}
