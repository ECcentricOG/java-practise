class MyThread extends Thread {

	public void run() {

		for(int i=10;i<20;i++)
			System.out.print(i+" ");
		
	}
}

class Demo {

	public static void main(String [] args) {

		MyThread t = new MyThread();
		t.start();

		for(int i=1;i<10;i++)
			System.out.print(i+" ");
	}
}
