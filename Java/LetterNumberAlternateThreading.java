
public class LetterNumberAlternateThreading {
	
	static Object lock = new Object();
	
	public static void main(String[] args) throws Exception {
	
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				
				synchronized (lock) {
					
					for (char c = 'a'; c<='z'; c++) {
						
						System.out.println(c);
						lock.notify();
						
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				
				synchronized (lock) {
					
					for (int i=1; i<=26; i++) {
						
						System.out.println(i);
						lock.notify();
						
						try {
							lock.wait();
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		};
		
		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		
		thread1.start();
		thread2.start();
	}
}
