package info.tiefenauer.mdp.patterns;

public class SingletonPattern {

	//--------------------------------
	// private variables
	//--------------------------------
	// Singleton instance
	private static SingletonPattern instance = null;
	
	/**
	 * Constructor (private)
	 */
	private SingletonPattern() {
		// some initialization logic here
	}
	
	/**
	 * Singleton method
	 * @return the singleton instance
	 */
	public static SingletonPattern getInstance() {
		if (instance != null) return instance;
		return new SingletonPattern();
	}
}
