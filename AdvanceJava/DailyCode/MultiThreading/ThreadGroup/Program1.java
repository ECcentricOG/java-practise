class MyThread extends Thread {

	MyThread(ThreadGroup tg,String str) {

		super(tg,str);
	}
	
	public void run() {

		System.out.println(currentThread());
	}
}

class Demo {

	public static void main(String [] ecc) {

		ThreadGroup tg = new ThreadGroup("OG");
	      	MyThread t = new MyThread(tg,"Umesh");
		t.start();
	}
}
