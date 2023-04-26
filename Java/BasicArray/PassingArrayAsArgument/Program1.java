class Demo{

	int fun(int x){

		int val = x + 50;
		return val;
	}

	public static void main(String [] args){

		Demo obj = new Demo();
		int ans = obj.fun(3);

		System.out.println(ans);
	}
}
