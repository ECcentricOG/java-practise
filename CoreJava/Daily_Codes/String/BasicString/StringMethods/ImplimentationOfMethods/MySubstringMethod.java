import java.io.*;
class Demo{

	static String mySubstring(String str,int start,int end){

		char [] ary = str.toCharArray();
		String ans = "";
		for(int i=start;i<end;i++){

			ans = ans+ary[i];
		}
		return ans;
	}

	static String mySubstring(String str,int start){

		char [] ary = str.toCharArray();
		String ans = "";
		for(int i=start;i<ary.length;i++){

			ans = ans + ary[i];
		}
		return ans;
	}


	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String : ");
		String str = br.readLine();

		System.out.println(str.substring(1));
		System.out.println(mySubstring(str,1));

		System.out.println(str.substring(1,3));
		System.out.println(mySubstring(str,1,3));
	}
		
}
