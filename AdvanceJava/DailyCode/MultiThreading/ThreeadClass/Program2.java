class MyThread extends Thread {

	public void run() {

		char ch = 'a';

		for(int i=0;i<10;i++) {

			System.out.println(ch++);

			try{
		
				Thread.sleep(2000);
			}catch(InterruptedException e){

			}
		}
	}
}

class Demo {

	public static void main(String [] args) throws InterruptedException{

		MyThread t = new MyThread();
		t.start();
		for(int i=0;i<10;i++) {

			System.out.println(i);
			Thread.sleep(2000);
		}
	}
}
