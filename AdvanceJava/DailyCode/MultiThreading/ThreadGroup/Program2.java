class MyThread implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread());
	}
}

class Demo {

	public static void main(String [] ecc) {

		MyThread obj = new MyThread();
		ThreadGroup ptg = new ThreadGroup("India");
		Thread t1 = new Thread(ptg,"MH");
		Thread t2 = new Thread(ptg,"Goa");
		t1.start();
		t2.start();

		ThreadGroup ctg = new ThreadGroup(ptg,"Pakistan");
		Thread t3 = new Thread(ctg,"Karachi");
		Thread t4 = new Thread(ctg,"Rawalpindi");
		t3.start();
		t4.start();

		ThreadGroup ctg2 = new ThreadGroup(ptg,"Bangladesh");
		Thread t5 = new Thread(ctg2,"Dhaka");
		t5.start();

		ctg.interrupt();

		System.out.println(ptg.activeCount());
		System.out.println(ptg.activeGroupCount());
	}
}
