package singleton;

public final class threadSafeLazySingleton {
	private threadSafeLazySingleton() {
		
	}
	
	private static volatile threadSafeLazySingleton instance = null;
	
	public static threadSafeLazySingleton getInstance() {
		if (instance == null) {
			synchronized(threadSafeLazySingleton.class) {
				if (instance == null) {
					instance = new threadSafeLazySingleton();
				}
			}
		}
		
		return instance;
	}
}
