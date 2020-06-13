package singleton;

public class test {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if (s1 == s2) {
			System.out.println("Getting the same instance.....");
		} else {
			System.out.println("Getting different instances");
		}
		
		
		lazySingleton ls1 = lazySingleton.getInstance();
		lazySingleton ls2 = lazySingleton.getInstance();
		if (ls1 == ls2) {
			System.out.println("Lazy implementation getting the same instance.....");
		} else {
			System.out.println("Lazy implementation getting different instances");
		}
	}
}
