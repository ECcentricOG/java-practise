class MyThread implements Runnable {

	public void run() {

		for(int i=0;i<10;i++)
			System.out.println("In Run");
	}
}

class Demo {

	public static void main(String [] ecc) {

		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
		t.yield();

		for(int i=0;i<10;i++) {

			System.out.println("In Main");
		}
	}
}
