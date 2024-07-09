import java.io.*;
import java.util.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows and columns : ");
		String str = br.readLine();
		StringTokenizer stz = new StringTokenizer(str," ");
		int row = Integer.parseInt(stz.nextToken());
		int col = Integer.parseInt(stz.nextToken());
		int [][] ary = new int [row][col];
		System.out.println("Enter elements in 2D array : ");
		for(int i=0;i<ary.length;i++){

			for(int j=0;j<ary[i].length;j++){

				ary[i][j] = Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Array : ");
		for(int i=0;i<ary.length;i++){

			for(int j=0;j<ary[i].length;j++){

				System.out.print(ary[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
