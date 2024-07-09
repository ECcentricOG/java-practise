import java.io.*;

class Solution {

	public static void main(String [] ecc) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		for(int i=n;i>0;i/=10) {
	
			int rem = i%10;
			if(rem == 0)
				rem = 5;

			ans = (ans*10)+rem;
		}
		int val = 0;
		for(int i=ans;i>0;i/=10) {

			int rem = i%10;
		    	val = (val*10)+rem;	
		}

		System.out.println(val);
	}
}
