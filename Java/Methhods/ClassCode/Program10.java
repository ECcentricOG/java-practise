class Demo{

	static void fun(int x){

		System.out.println();
	}

	public static void main(String [] args){

		fun(10);
		fun(10.4f);
		fun('A');
		fun(10.10);
		fun("Umesh");
		fun(true);
	}
}

/*
error: incompatible types: possible lossy conversion from float to int
		fun(10.4f);
		    ^
error: incompatible types: possible lossy conversion from double to int
		fun(10.10);
		    ^
error: incompatible types: String cannot be converted to int
		fun("Umesh");
		    
error: incompatible types: boolean cannot be converted to int
		fun(true);
		    ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
*/
