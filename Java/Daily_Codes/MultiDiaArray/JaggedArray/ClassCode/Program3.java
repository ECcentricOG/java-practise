class Demo{

	public static void main(String [] args){

		int [][] ary = new int[3][];

		ary[0] = new int[]{10,20,30};
		ary[1] = new int[]{30,40};
		ary[2] = new int[]{70};

		for(int [] x : ary){

			for(int y : x){

				System.out.print(y+"  ");
			}
			System.out.println();
		}
	}
}
