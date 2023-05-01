class Demo{

	public static void main(String []args){

		int [][] ary = {{10,20,30},{30,40},{50}};

		for(int i=0;i<ary.length;i++){

			for(int j=0;j<ary[i].length;j++){

				System.out.print(ary[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
