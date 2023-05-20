import java.io.*;
class Demo{

	static int avg(int [] arr){

		int n = arr.length;
		int sum = 0;

		for(int i=0;i<arr.length;i++){

			sum += arr[i];
		}
		int ans = sum/n;
		return ans;
	}

	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter No of Students : ");
		int n = Integer.parseInt(br.readLine());

		int [][] ary = new int [n][];

		for(int i=0;i<ary.length;i++){

			System.out.print("Enter no of test for Student "+(i+1)+" : ");
			int tests = Integer.parseInt(br.readLine());

			ary [i] = new int[tests];

			for(int j=0;j<ary[i].length;j++){

				System.out.print("Enter test no "+(j+1)+" marks : ");
				ary[i][j] = Integer.parseInt(br.readLine());
			}
		}


		for(int i=0;i<ary.length;i++){

			System.out.println("Average Of "+(i+1)+" student is "+avg(ary[i]));
		}
	}
}
