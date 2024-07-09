import java.io.*;
class Demo {

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());

		int [] ary = new int[n];

		for(int i=0;i<ary.length;i++)
			ary[i] = Integer.parseInt(br.readLine());

		int temp = ary[0];

		for(int i=0;i<ary.length;i++) {

			for(int j=i+1;j<ary.length;j++) {

				if(ary[i] > ary[j]){

					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}				
			}
		}

		for(int x : ary)
			System.out.print(x+" ");
	}
}
