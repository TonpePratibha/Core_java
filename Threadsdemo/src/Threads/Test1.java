package Threads;

public class Test1 {
public static void main (String[] args)throws InterruptedException {
 	System.out.println(Thread.currentThread());
 	
 	
 	

	Myclass t1=new Myclass("one");
	Myclass t2=new Myclass("two");
	Myclass t3=new Myclass("three");
	
	System.out.println(t1.isAlive()+" "+t3.isAlive());
	for (int i = 0; i < 10; i++) {
		System.out.println(Thread.currentThread().getName() + "execute count" + i);
		Thread.sleep(1000); // throws exception
	}
	///main gets executed last it takes time because of sleep

	System.out.println(t1.isAlive()+" "+t3.isAlive());
	
}}
