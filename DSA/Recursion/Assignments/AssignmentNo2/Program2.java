class Solution {

	static int fun(int num) {

		if(num == 0)
			return 1;

		return num%10 * fun(num/10);
	}

	public static void main(String [] ecc) {

		int num = 345;
		int product = 1;
		for(int i=num;i>0;i/=10) {

			int rem = i%10;
			product *= rem;
		}
		System.out.println(product);

		System.out.println(fun(num));
	}
}
