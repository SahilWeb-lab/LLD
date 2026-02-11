package singleton;

public class Singleton {
	
//	Lazy initialization:
//	private static Singleton instance = null;	
//	
//	private Singleton() {
//		System.out.println("Contructor called!");
//	}
//	
//	public static Singleton getInstance() {
//		if(instance == null)
//			instance = new Singleton();
//		
//		return instance;
//	}
	
//	Eager initialization:
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		System.out.println("Constructor Called!");
	}
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		Singleton obj1 =  Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
	
}
