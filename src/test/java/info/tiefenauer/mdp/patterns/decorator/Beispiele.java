package info.tiefenauer.mdp.patterns.decorator;

import java.util.ArrayList;

import info.tiefenauer.mdp.patterns.decorator.beilagen.Bohnen;
import info.tiefenauer.mdp.patterns.decorator.beilagen.Nudeln;
import info.tiefenauer.mdp.patterns.decorator.beilagen.Pommes;
import info.tiefenauer.mdp.patterns.decorator.beilagen.Salat;
import info.tiefenauer.mdp.patterns.decorator.extras.Tomatensauce;
import info.tiefenauer.mdp.patterns.decorator.hauptspeisen.Schnitzel;
import info.tiefenauer.mdp.patterns.decorator.hauptspeisen.Steak;
import info.tiefenauer.mdp.patterns.decorator.interfaces.IGericht;

public class Beispiele {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IGericht steakMitBohnen = new Bohnen(new Steak());
		IGericht schnipo = new Pommes(new Schnitzel());
		IGericht nudelnMitSalat = new Nudeln(new Salat(null));
		
		IGericht schnipoSa = new Salat(schnipo);
		IGericht nudelnTomateSalat = new Tomatensauce(nudelnMitSalat);
		
		ArrayList<IGericht> gerichte = new ArrayList<IGericht>();
		gerichte.add(steakMitBohnen);
		gerichte.add(schnipo);
		gerichte.add(nudelnMitSalat);
		gerichte.add(schnipoSa);
		gerichte.add(nudelnTomateSalat);
		
		for(IGericht gericht : gerichte) {
			System.out.println("Gericht: " + gericht.getDescription() + ", Preis: " + gericht.getPrice());
		}
		
	}

}
