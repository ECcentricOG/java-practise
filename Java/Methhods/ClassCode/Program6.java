class Demo{

	void fun(){

		System.out.println("Inside fun method");
	}

	public static void main(String [] args){

		Demo obj = new Demo();
		obj.fun(10);
	}
}

/* error: method fun in class Demo cannot be applied to given types;
		obj.fun(10);
		   ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
*/


