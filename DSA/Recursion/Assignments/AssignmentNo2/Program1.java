class Solution {

	static int div = 1;

	static void fun(int num) {	

		if(div > num / 2)
			return;

		if(num % div == 0)
			System.out.println(div);

		++div;
		fun(num);
	}

	public static void main(String [] ecc) {

		int num = 10;

		for(int i=1;i<=num/2;i++) {

			if(num % i == 0)
				System.out.println(i);
		}

		fun(num);
	}
}
