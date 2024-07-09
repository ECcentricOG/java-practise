import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());
		char [] ary = new char [n];
		
		for(int i=0;i<ary.length;i++){

			ary[i] = (char)br.read();
			br.skip(1);
		}
		
		for(int i=0;i<ary.length;i++){	

			if(ary[i] == 'a' || ary[i] == 'e' || ary[i] == 'i' || ary[i] == 'o' || ary[i] == 'u'){

				System.out.print(ary[i]+" ");
			}	
		}
			
	}
}
