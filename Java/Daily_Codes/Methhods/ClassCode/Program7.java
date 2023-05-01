class Demo{

	void fun(){

		System.out.println("Inside fu method");
	}

	public static void main(String [] args){

		Demo obj = new Demo();
		System.out.println(obj.fun());
	}
}
/* error: 'void' type not allowed here
		System.out.println(obj.fun());
				       ^
*/
