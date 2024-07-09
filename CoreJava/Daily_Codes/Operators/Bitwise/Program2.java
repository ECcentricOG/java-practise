class Bitwise{

	public static void main(String [] args){

		int x = 8; // 0000 1000
		int y = 10;// 0000 1010
	 	
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
	}
}

/* for XOR 0 0 0
 *         1 0 1
 *         0 1 1
 *         1 1 0  */
