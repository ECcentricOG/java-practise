class Demo{

	public static void main(String [] args){

		int ary [][] = {{},{},{}};
		int ary2 [][] = new int[3][];

		System.out.println(ary.length);
		System.out.println(ary[0].length);

		System.out.println(ary2.length);
		System.out.println(ary2[0].length);
	}
}

/*
0
3
Exception in thread "main" java.lang.NullPointerException
	at Demo.main(Program1.java:12)
*/

