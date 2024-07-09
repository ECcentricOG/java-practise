import java.io.*;

class Solution {
        
        public static void main(String [] ecc) throws IOException {
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Array Size : ");
                int size = Integer.parseInt(br.readLine());
                int [] arr = new int[size];
                System.out.println("Enter Values : ");
                for(int i=0;i<arr.length;i++) {
                
                        arr[i] = Integer.parseInt(br.readLine());
                }
		System.out.println("Enter range : ");
		System.out.print("Start : ");
		int start = Integer.parseInt(br.readLine());
		System.out.print("End : ");
		int end = Integer.parseInt(br.readLine());
		int ans = (end - start) + 1;
		int count = 0;
                for(int i=0;i<arr.length;i++) {

			for(int j=start;j<=end;j++) {

				if(j == arr[i])
					count++;
			}	
                }

		if(count == ans)
			System.out.println("Yes");
		else
			System.out.println("No");
        }
} 

