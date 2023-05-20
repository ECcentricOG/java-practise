import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());

		int [] ary1 = new int [n];
		int [] ary2 = new int [n];

		for(int i=0;i<ary1.length;i++){

			ary1 [i] = Integer.parseInt(br.readLine());

			if(ary1[i] %2 == 0)
				ary2[i] = 1;
		}

		for(int i=0;i<ary1.length;i++)
			System.out.print(ary1[i]+" ");

		System.out.println();

		for(int i=0;i<ary2.length;i++)
			System.out.print(ary2[i]+" ");

		System.out.println();
	}
}
