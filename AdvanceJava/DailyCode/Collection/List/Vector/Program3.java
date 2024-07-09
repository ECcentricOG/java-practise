import java.util.*;

class MyThread extends Thread{

	MyThread() {


	}

	MyThread(Vector v) {

		this.v = v;
	}

	Vector v;

	public void run() {

		for(int i=0;i<10;i++){
			v.add(i+10);
			System.out.println(v);
			try{

				Thread.sleep(3000);
			}catch(InterruptedException e) {


			}
		}	
	}
}

class Demo {

	public static Vector fun() {

		Vector v = new Vector();
		return v;
	}

	public static void main(String [] ecc) {
		
		Vector v = fun();

		MyThread t = new MyThread(v);
		t.start();
		
		for(int i=0;i<10;i++){
			v.add(i);
			System.out.println(v);
			try{

                                Thread.sleep(3000);
                        }catch(InterruptedException e) {


                        }

		}
	}
}
