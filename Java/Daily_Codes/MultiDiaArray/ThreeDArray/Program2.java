import java.io.*;
class Demo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter No. of Planes : ");
		int z = Integer.parseInt(br.readLine());
		int [][][] ary = new int [z][][];

		for(int i=0;i<ary.length;i++){

			System.out.print("Enter No of rows in "+(i+1)+" plane : ");
			int x = Integer.parseInt(br.readLine());
			ary[i] = new int[x][];

			for(int j=0;j<ary[i].length;j++){

				System.out.print("Enter No of columns in "+(j+1)+" rows : ");
				int y = Integer.parseInt(br.readLine());
				ary[i][j] = new int[y];
			}
		}

		for(int i=0;i<ary.length;i++){

			for(int j=0;j<ary[i].length;j++){

				for(int k=0;k<ary[i][j].length;k++){

					ary[i][j][k] = Integer.parseInt(br.readLine());
				}
			}
		}
		System.out.println("Array");
		for(int [][] a : ary){

			for(int [] b : a){
			
				for(int c : b){

					System.out.print(c+"  ");
				}
				System.out.println();
			}
			System.out.println();
		}		
	}
}
