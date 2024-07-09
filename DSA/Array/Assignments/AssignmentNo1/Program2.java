import java.io.*;
class Solution {

	public static int occurrenceCount(int [] A,int B) {

		int count = 0;
		for(int i=0;i<A.length;i++) {
		
			if(A[i] == B)
				count++;
		}
		return count;
	}

	public static void main(String [] ecc) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Array Size : ");
                int N = Integer.parseInt(br.readLine());
                int [] A = new int[N];
                System.out.println("Enter Values : - ");

                for(int i=0;i<A.length;i++) {

                        A[i] = Integer.parseInt(br.readLine());
                }
		System.out.print("Enter Element to find occurrences : ");
		int B = Integer.parseInt(br.readLine());
                System.out.println(occurrenceCount(A,B));
        }
}
