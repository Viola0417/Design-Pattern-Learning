package singleton;

/*
 * Singleton pattern is used to limit creation of a class to only one object
 * Beneficial when one and only one object is needed to coordinate actions across system
 * eg. caches, thread pools and registries
 * 
 * whenever this class is loaded, this instance will be loaded.
 * loading class slower, getting instance faster
 * thread-safe
 */
public class Singleton {
	//1. declare constructors of the class to be private
	//   ensure a class has only one instance
	private Singleton() {
		
	}
	
	//2. create only instance of this class, make it as a private member
	//   avoiding access from other class
	private static Singleton instance = new Singleton();
	
	//3. provide a function to get instance
	public static Singleton getInstance() {
		return instance;
	}
}
