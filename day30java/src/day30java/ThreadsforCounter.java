package day30java;

public class ThreadsforCounter implements Runnable { 

	  public void run() {
		  int i=0;
			  while (true) {  
		 System.out.println("current Token of Counter :" + i);
		  i++;
			  if (i==5000) {		
			  i=0;
			  try {
					Thread.sleep(10);
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
			Thread t1 =new Thread (tc);
			Thread t2 = new Thread (tc);
	        
	         t1.start();
	         t2.start();
	        
		}
	}
