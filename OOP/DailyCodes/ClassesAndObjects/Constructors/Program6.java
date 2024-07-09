class Demo{

	private int jerNo = 0;
	private String name = null;

	Demo(int jerNo ,String name){

		this.jerNo = jerNo;
		this.name = name;
	}

	void fun(){

		System.out.println(name+" : "+jerNo);
	}
}

class Client{

	public static void main(String [] args){

		Demo obj1 = new Demo(10,"Messi");
		obj1.fun();
		
		Demo obj2 = new Demo(8,"Iniensta");
		obj2.fun();
	}
}
