class Solution {

	static int fun(int num) {
	
		if(num == 0)
			return 0;

		return (num%10 + fun(num/10)) * 10;
	}

	public static void main(String [] ecc) {

		int num = 121;
		int rev = 0;

		for(int i=num;i>0;i/=10) {

			int rem = i%10;
			rev = rem + (rev * 10);
		}

		if(rev == num)
			System.out.println("Yes");
		else
			System.out.println("No");

		if(num == fun(num))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
