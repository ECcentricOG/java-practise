class Demo{

	public static void main(String [] args){

		int [][] ary = {{10,20,30},{40,50},{70}};

		for(int[] x : ary){

			for(int y : x){

				System.out.print(y+"  ");
			}
			System.out.println();
		}
	}
}
