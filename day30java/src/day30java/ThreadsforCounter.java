package day30java;

class ThreadsforCounter1 extends Thread {
	public void run ( ) {
		int j = 0;
		while (true) {
			System.out.println("current token of Counter1 is :" + j);
			j++;
			if (j==5000) {
				j = 0 ;
				try {
					Thread.sleep(10000);
					}
				catch (Exception e)  
				{  
				// catching the exception  
					System.out.println(e);  
				}
			}
		}
	}
}
public class ThreadsforCounter implements Runnable { 

	  public void run() {
		  int i=0;
			  while (true) {  
		 System.out.println("current Token of Counter is :" + i);
		  i++;
			  if (i==5000) {		
			  i=0;
			  try {
					Thread.sleep(10000);
					}
				catch (Exception e)  
				{  
				// catching the exception  
				System.out.println(e);  
			}
			}
			  }
	  }
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
		  ThreadsforCounter tc = new ThreadsforCounter();
		  ThreadsforCounter1 tc1 = new ThreadsforCounter1();
			Thread t1 =new Thread (tc);
			Thread t2 = new Thread (tc1);
	        
	         t1.start();
	         t2.start();
	        
		}
	}
