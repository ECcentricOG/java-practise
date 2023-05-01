class Demo{

	int addTen(int x){

		return x+10;
	}

	public static void main(String [] args){

		Demo obj = new Demo();
		System.out.println(obj.addTen(3));

		int ans = obj.addTen(33);
		System.out.println(ans);
	}
}
