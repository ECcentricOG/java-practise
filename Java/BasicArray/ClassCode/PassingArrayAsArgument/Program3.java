class Demo{

	static void fun(int [] ary){

		for(int i=0;i < ary.length ;i++){

			ary[i] = ary[i] + 3;
		}
	}

	public static void main(String [] args){

		int [] arr = {10,20,30,40};
		
		for(int x : arr){

			System.out.print(x+"  ");
		}
		
		fun(arr);
		System.out.println();
		for(int x : arr){

			System.out.print(x+"  ");
		}
		System.out.println();
	}
}
