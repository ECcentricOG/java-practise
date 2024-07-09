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
		int ans = 1;
		for(int x : arr) {

			ans *= x;
		}

		System.out.println("Product is "+ans);
        }
} 
