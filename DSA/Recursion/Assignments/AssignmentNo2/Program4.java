class Solution {

	static int fun(int num) {

		if(num == 1)
			return 1;

		if(num % 2 == 1)
			return num + fun(num-=2);

		return fun(--num);
	}

	public static void main(String [] ecc) {

		int num = 14;
		int sum = 0;

		for(int i=1;i<=num;i+=2) {

			if(i % 2 == 1)
				sum += i;
		}

		System.out.println(sum);

		System.out.println(fun(num));
	}
}
