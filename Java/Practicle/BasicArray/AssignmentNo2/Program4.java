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
		System.out.print("Enter a element to search : ");
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<ary.length;i++){

			if(ary[i] == num){

				System.out.println("Element is on index "+i);
			}else{

				System.out.println("There is no such element in array ");
			}
		}
	}
}
