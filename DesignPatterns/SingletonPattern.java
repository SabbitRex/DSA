class SingletonEagerInit {
	
	private static SingletonEagerInit instance = new SingletonEagerInit();
	
	private SingletonEagerInit() {}
	
	public static SingletonEagerInit getInstance() {
		
		return instance;
	}
	
	public void someMethod() {
		
		System.out.println("Eager");
	}
}

class SingletonLazyInit {
	
	private static SingletonLazyInit instance;
	
	private SingletonLazyInit() {}
	
	public static SingletonLazyInit getInstance() {
		
		if (instance == null) {
			
			instance = new SingletonLazyInit();
		}
		
		return instance;
	}
	
	public void someMethod() {
		
		System.out.println("Lazy");
	}
}

class SingletonSynchronizedMethodInit {
	
	private static SingletonSynchronizedMethodInit instance;
	
	private SingletonSynchronizedMethodInit() {}
	
	public synchronized static SingletonSynchronizedMethodInit getInstance() {
		
		if (instance == null) {
			
			instance = new SingletonSynchronizedMethodInit();
		}
		
		return instance;
	}
	
	public void someMethod() {
		
		System.out.println("SyncMethod"); 
	}
}

class SingletonSynchronizedBlockInit {
	
	private static SingletonSynchronizedBlockInit instance;
	
	private SingletonSynchronizedBlockInit() {}
	
	public static SingletonSynchronizedBlockInit getInstance() {
		
		if (instance == null) {
			
			synchronized (SingletonSynchronizedBlockInit.class) {
				
				instance = new SingletonSynchronizedBlockInit();
			}
		}
		
		return instance;
	}
	
	public void someMethod() {
		
		System.out.println("SyncBlock");
	}
}

public class SingletonPattern {
	
	public static void main(String[] args) {
		
		SingletonEagerInit  eagerInstance = SingletonEagerInit.getInstance();
		System.out.println(eagerInstance);
		
		SingletonEagerInit  eagerInstanceNew = SingletonEagerInit.getInstance();
		System.out.println(eagerInstanceNew);
		
		SingletonLazyInit lazyInstance = SingletonLazyInit.getInstance();
		System.out.println(lazyInstance);
		
		SingletonLazyInit lazyInstanceNew = SingletonLazyInit.getInstance();
		System.out.println(lazyInstanceNew);
		
		SingletonSynchronizedMethodInit syncMethodInstance = SingletonSynchronizedMethodInit.getInstance();
		System.out.println(syncMethodInstance);
		
		SingletonSynchronizedMethodInit syncMethodInstanceNew = SingletonSynchronizedMethodInit.getInstance();
		System.out.println(syncMethodInstanceNew);
		
		SingletonSynchronizedBlockInit syncBlockInstance = SingletonSynchronizedBlockInit.getInstance();
		System.out.println(syncBlockInstance);
		
		SingletonSynchronizedBlockInit syncBlockInstanceNew = SingletonSynchronizedBlockInit.getInstance();
		System.out.println(syncBlockInstanceNew);
	}
}
