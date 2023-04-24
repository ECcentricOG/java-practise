import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());
		int evenCount = 0;
		int oddCount = 0;

		int [] ary = new int[n];

		for(int i=0;i<ary.length;i++){

			ary[i] = Integer.parseInt(br.readLine());

			if(ary[i]%2 == 0){

				evenCount++;
			}else{

				oddCount++;
			}
		}

		System.out.println("Even Count : "+evenCount);
		System.out.println("Odd Count : "+oddCount);

	}
}
