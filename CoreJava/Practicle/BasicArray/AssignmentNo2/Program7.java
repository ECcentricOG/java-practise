import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array1 Size : ");
		int n = Integer.parseInt(br.readLine());
		System.out.print("Enter Array2 Size : ");
		int m = Integer.parseInt(br.readLine());
		int [] ary1 = new int[n];
		int [] ary2 = new int[m];
		System.out.println("Enter values in Array1 :-");
		for(int i=0;i<ary1.length;i++){

			ary1[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter values in Array2 :- ");
		for(int i=0;i<ary2.length;i++){
		
			ary2[i] = Integer.parseInt(br.readLine()); 
		}
		System.out.println("Common elements are :- ");
		for(int i=0;i<ary1.length;i++){

			for(int j=0;j<ary2.length;j++){

				if(ary1[i] == ary2[j]){

					System.out.print(ary1[i]+"  ");
				}
			}
		}
		System.out.println();
	}
}
