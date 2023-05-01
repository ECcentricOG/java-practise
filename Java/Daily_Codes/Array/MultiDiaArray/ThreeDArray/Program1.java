class Demo{

	public static void main(String [] args){

		int [][][] ary = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};

		for(int [][] x : ary){

			for(int [] y : x){

				for(int z : y){

					System.out.print(z+"   ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
