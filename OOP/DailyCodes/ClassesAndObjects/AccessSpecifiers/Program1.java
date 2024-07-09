class Demo{

	int x = 10;
	private String str = "ECcentricOG";
}	
class Solution{

	public static void main(String [] args){

		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.str);
	}
}
/*
 *  str has private access in Demo
		System.out.println(obj.str);
		                      ^
*/
