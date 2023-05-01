import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());
		int [] ary = new int[n];
		for(int i=0;i<ary.length;i++){

			ary[i] = Integer.parseInt(br.readLine());
		}
		int max = 0;
		int max2 = 0;
		if(ary[0]>ary[1]){

			max = ary[0];
			max2 = ary[1];
		}else{

			max = ary[1];
			max2 = ary[0];
		}

		for(int i=2;i<ary.length;i++){

			if(ary[i]>max){

				max2 = max;
				max = ary[i];
			}else if(ary[i]>max2){
	
				max2 = ary[i];
			}
		}
		System.out.println("2nd largest is "+max2);
	}
}
