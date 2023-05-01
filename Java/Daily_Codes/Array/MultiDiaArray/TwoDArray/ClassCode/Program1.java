class Demo{

	public static void main(String [] args){

		int [][] ary = new int[2][2];

		ary[0][0] = 10;
		ary[0][1] = 20;
		ary[1][0] = 30;
		ary[1][1] = 40;

		for(int i=0;i<2;i++){

			for(int j=0;j<2;j++){

				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
	}
}
