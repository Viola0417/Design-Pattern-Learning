package singleton;

/*
 * Lazy implementation
 * when class loaded, not initialize instance; only initialized when first user uses it.
 * 
 * loading class faster, getting instance slower
 * need to pay attention to thread-safe, unable to work in multi-threading
 */

public class lazySingleton {
	//1. declare constructors of the class to be private
	//   ensure a class has only one instance
	private lazySingleton() {
		
	}
	
	//2. declare only instance of this class, but without initialization
	private static lazySingleton instance;
	
	//3. provide a function to get instance
	public static lazySingleton getInstance() {
		if (instance == null) {
			//only the instance has not been initialized, we do initialization
			instance = new lazySingleton();
		}
		return instance;
	}
}

