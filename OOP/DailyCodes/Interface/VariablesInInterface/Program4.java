interface Demo {

	int x = 10;
}

interface My {

	int x = 20;
}

class Client implements Demo,My {

	public static void main(String [] args) {
	
		System.out.println(x);
	}
}

/*
 * reference to x is ambiguous
		System.out.println(x);
		                   ^
  both variable x in Demo and variable x in My match
*/
