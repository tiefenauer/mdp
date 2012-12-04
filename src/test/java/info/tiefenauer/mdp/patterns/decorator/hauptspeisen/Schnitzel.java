package info.tiefenauer.mdp.patterns.decorator.hauptspeisen;

import info.tiefenauer.mdp.patterns.decorator.abstracts.AHauptspeise;

public class Schnitzel extends AHauptspeise {

	public Schnitzel() {
		super();
		this.description = "Schnitzel";
		this.price = 20;
	}

}
