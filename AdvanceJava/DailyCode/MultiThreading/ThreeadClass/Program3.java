class MyThread extends Thread {

	public void run () {

		System.out.print(Thread.currentThread().getName());
	}
}

class Demo {

	public static void main(String [] args) {

		MyThread t = new MyThread();
		t.start();

		MyThread t2 = new MyThread();
		t2.start();

		System.out.println(Thread.currentThread().getName());
	}
}
