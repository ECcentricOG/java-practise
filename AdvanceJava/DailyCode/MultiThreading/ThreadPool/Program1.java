import java.util.concurrent.*;
class MyThread implements Runnable{

	int num;

	MyThread(int num) {

		this.num = num;
	}

	public void run() {

		System.out.println("START : "+Thread.currentThread()+" "+num);
		fun();
		System.out.println("END : "+Thread.currentThread()+" "+num);
	}

	void fun() {

		try{

			Thread.sleep(5000);
		}catch(InterruptedException ie) {

		}
	}
}

class Demo {

	public static void main(String [] args) {

		ExecutorService ser = Executors.newFixedThreadPool(3);

		for(int i=1;i<=9;i++) {

			MyThread t = new MyThread(i);
			ser.execute(t);
		}

		ser.shutdown();
	}
}
