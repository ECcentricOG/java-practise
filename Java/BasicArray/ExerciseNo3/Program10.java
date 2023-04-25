import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());
		int [] ary = new int [n];
		for(int i=0;i<ary.length;i++){

			ary[i] = Integer.parseInt(br.readLine());
		}
		int min = 0;
		int min2 = 0;
		if(ary[0]<ary[1]){

			min = ary[0];
			min2 = ary[1];
		}else{

			min = ary[1];
			min2 = ary[0];
		}

		for(int i=2;i<ary.length;i++){

			if(ary[i]<min){

				min2 = min;
				min = ary[i];
			}else if(ary[i]<min2){

				min2 = ary[i];
			}
		}
		System.out.println("2nd minimum is "+min2);
	}
}
