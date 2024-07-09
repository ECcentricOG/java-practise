import java.io.*;
class Demo{

	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter No of Planes : ");
		int z = Integer.parseInt(br.readLine());

		int [][][] ary = new int [z][][];

		for(int i=0;i<ary.length;i++){

			System.out.print("Enter No of Rows : ");
			int x = Integer.parseInt(br.readLine());

			ary [i] = new int [x][];

			for(int j=0;j<ary[i].length;j++){

				System.out.print("Enter No of Cols : ");
				int y = Integer.parseInt(br.readLine());
				
				ary[i][j] = new int [y];

				for(int k=0;k<ary[i][j].length;k++){

					ary[i][j][k] = Integer.parseInt(br.readLine());
				}
			}
		}


		for(int i=0;i<ary.length;i++){

			int sum = 0;

			for(int j=0;j<ary[i].length;j++){

				for(int k=0;k<ary[i][j].length;k++){

					sum += ary[i][j][k];
				}
			}
			System.out.println("Sum of Plane "+(i+1)+" is "+sum);
		}
	}
}
