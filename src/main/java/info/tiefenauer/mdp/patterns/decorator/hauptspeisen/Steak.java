package info.tiefenauer.mdp.patterns.decorator.hauptspeisen;

import info.tiefenauer.mdp.patterns.decorator.abstracts.AHauptspeise;
import info.tiefenauer.mdp.patterns.decorator.interfaces.IGericht;

public class Steak extends AHauptspeise {

	public Steak() {
		super();
		this.description = "Steak";
		this.price = 25.50;
	}

}
