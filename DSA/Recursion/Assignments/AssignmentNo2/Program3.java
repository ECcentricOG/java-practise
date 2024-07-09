class Solution {

	static int fun(int num) {

		if(num == 0)
			return 0;

		if(num % 10 < fun(num / 10))
			return fun(num / 10);

		return num % 10;
	}

	public static void main(String [] ecc) {

		int num = 856;
		int max = Integer.MIN_VALUE;

		for(int i=num;i>0;i/=10) {

			int rem = i%10;
			if(rem > max)
				max = rem;
		}

		System.out.println(max);

		System.out.println(fun(num));
	}
}
