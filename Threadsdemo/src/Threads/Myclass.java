package Threads;

public class Myclass extends Thread {

	public Myclass(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	public void run() {
		System.out.println(getName()+"thread start");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName()+"executing " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(getName() + "get exc" + e);
		}
		System.out.println("thread over");
	}

}
