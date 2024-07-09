class MyThread extends Thread {
        
        MyThread(String str) {

                super(str);
        }

        public void run() {
        
                System.out.println(Thread.currentThread());
        }
}       

class Demo {
        
        public static void main(String [] ecc) {
        
                MyThread t = new MyThread("Umesh");
		t.start();
        }
} 
