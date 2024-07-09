import java.io.*;
class Solution{

        public static void main(String [] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Array1 Size : ");
                int n = Integer.parseInt(br.readLine());
		System.out.print("Enter Array 2 Size : ");
                int m = Integer.parseInt(br.readLine());
                int [] ary2 = new int[m];
                int [] ary1 = new int[n];
		int s = n + m;
		int [] ary3 = new int[s];
		System.out.println("Array 1 ");
                for(int i=0;i<ary1.length;i++){

                        ary1[i] = Integer.parseInt(br.readLine());
                }
		System.out.println("Array 2");
                for(int i=0;i<ary2.length;i++){

                        ary2[i] = Integer.parseInt(br.readLine());
                }

		for(int i=0;i<ary1.length;i++){

			ary3[i] = ary1[i];	
		}

		for(int i=0;i<ary2.length;i++){

			ary3[ary1.length+i] = ary2[i];
		}

		for(int i=0;i<ary3.length;i++){

			System.out.print(ary3[i]+" ");
		}
		System.out.println();
	}
}	
