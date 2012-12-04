package info.tiefenauer.mdp.patterns.decorator.abstracts;

import info.tiefenauer.mdp.patterns.decorator.interfaces.IGericht;
import info.tiefenauer.mdp.patterns.decorator.interfaces.KomponentenTyp;

public abstract class AGericht implements IGericht {

	protected double price = 0;
	protected String description = "";
	protected KomponentenTyp typ = null;


}
