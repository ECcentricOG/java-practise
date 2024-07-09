import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());
		int [] ary = new int[n];
		int evenCount = 0;
		int oddCount = 0;

		for(int i=0;i<ary.length;i++){

			ary[i] = Integer.parseInt(br.readLine());

			if(ary[i]%2 == 0){

				evenCount++;
			}else{

				oddCount++;
			}
		}
		System.out.println("Even elements : "+evenCount);
		System.out.println("Odd elements : "+oddCount);
	}
}
