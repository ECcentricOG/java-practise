class MyThread implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread());
	}
}

class Demo {

	public static void main(String [] args) {

		MyThread obj = new MyThread();
		ThreadGroup ptg = new ThreadGroup("Parent");
		Thread t1 = new Thread(ptg,obj,"Poonam");
		Thread t2 = new Thread(ptg,obj,"Umesh");
		t1.start();
		t2.start();

		ThreadGroup ctg1 = new ThreadGroup(ptg,"Daughter");
		Thread t3 = new Thread(ctg1,obj,"One");
		t3.start();

		ThreadGroup ctg2 = new ThreadGroup(ptg,"Son");
		Thread t4 = new Thread(ctg2,obj,"Boy");
		t4.start();

		System.out.println(ptg.activeCount());
		System.out.println(ptg.activeGroupCount());
	}
}
