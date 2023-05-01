import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array1 Size : ");
		int n = Integer.parseInt(br.readLine());
		int [] ary1 = new int[n];
		for(int i=0;i<ary1.length;i++){

			ary1[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("Enter Array 2 Size : ");
		int m = Integer.parseInt(br.readLine());
		int [] ary2 = new int[m];
		for(int i=0;i<ary2.length;i++){

			ary2[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Uncommon elements :- ");
		for(int i=0;i<ary1.length;i++){
			
			boolean same = false;

			for(int j=0;j<ary2.length;j++){

				if(ary1[i] == ary2[j]){
			
					same = true;
					break;
				}else{

					same = false;
				}
			}

			if(same == false){

				System.out.print(ary1[i]+"  ");
			}
		}

		for(int i=0;i<ary2.length;i++){

			boolean same = false;

			for(int j=0;j<ary1.length;j++){

				if(ary2[i] == ary1[j]){

					same = true;
					break;
				}else{

					same = false;
				}
			}

			if(same == false){

				System.out.print(ary2[i]+"  ");
			}
		}
		System.out.println();
	}
}
