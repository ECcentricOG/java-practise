import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of array : ");
		int n = Integer.parseInt(br.readLine());

		int [] ary = new int[n];
		int sum = 0;

		for(int i=0;i<ary.length;i++){

			ary[i] = Integer.parseInt(br.readLine());
			sum = sum + ary[i];
		}

		System.out.println("Sum : "+sum);
	}
}
