class Demo{

	public static void main(String [] args){

		int ary1 = new int[4];

		ary1[0] = 10;
		ary1[1] = 10;
		ary1[2] = 10;
		ary1[3] = 10;

		int ary2 = {20,20,20,20};

		int ary3 = new int[]{30,30,30,30};

		int ary4 = new int[4]{40,40,40,40};	
	}
}

/*	error: array creation with both dimension expression and initialization is illegal
		int ary4 = new int[4]{40,40,40,40};	
		                     ^
*/
