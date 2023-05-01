import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter No of rows : ");
		int row = Integer.parseInt(br.readLine());
		int [][] ary = new int [row][];

		for(int i=0;i<ary.length;i++){

			System.out.print("Enter row number "+(i+1)+" size :");
			int size = Integer.parseInt(br.readLine());
			ary[i] = new int [size];
		}
		
		for(int i=0;i<ary.length;i++){
			
			System.out.println("Enter elements in "+(i+1)+" row :");

			for(int j=0;j<ary[i].length;j++){

				ary[i][j] = Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Array");
		for(int [] x : ary){

			for(int y : x){

				System.out.print(y+"  ");
			}
			System.out.println();
		}
	}
}
