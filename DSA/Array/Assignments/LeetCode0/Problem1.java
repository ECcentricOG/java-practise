import java.io.*;
class Solution {

	public static int reverseInt(int n) {
		
		String val = n+"";
		char [] arr = val.toCharArray();
		String ans = "";
		if(n > 0) {

			for(int i=arr.length-1;i>=0;i--)
				ans += arr[i];
			return Integer.parseInt(ans);
		}else {

			ans += arr[0];
			for(int i=arr.length-1;i>0;i--)
				ans += arr[i];
			return Integer.parseInt(ans);
		}
	}

	public static void main(String [] ecc) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(reverseInt(n));
	}
}
