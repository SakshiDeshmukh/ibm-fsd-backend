package com.assign.core.multithreading;
//pass exceution by holding lock-sleep(interrupt/timeout)
//pass exceution by releasing lock-wait(interrupt/timeout/?)

public class CounterDemo  {
	private static Counter counter;
public static class  CounterThread implements Runnable {
	@Override
	public void run() {
		
		counter.Increment();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		counter.Decrement();
		counter.Decrement();

	}
	public static void main(String[] args) {
 counter = new Counter();
//counter.Increment();
//counter.Decrement();
//counter.Increment();
//ounter.Increment();
System.out.println(counter.getValue());
  Thread t1 = new Thread();
  Thread t2 = new Thread();
  t1.start();

  t2.start();

	}

 }
}
