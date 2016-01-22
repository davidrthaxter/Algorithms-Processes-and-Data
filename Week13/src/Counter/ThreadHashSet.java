package Counter;

import java.util.HashSet;

public class ThreadHashSet<T extends Thread> extends HashSet<T> implements ThreadSet<T>{

	public void runSet() throws InterruptedException {
		for(Thread thread : this)
		{
			thread.start();
		}
		for(Thread thread : this)
		{
			try{
				thread.join();
			}catch(InterruptedException e){};
		}
		
	}
}
