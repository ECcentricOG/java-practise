import java.io.*;
class Demo{

	static String myConcatMethod(String str1 , String str2){

		char [] ary1 = str1.toCharArray();
		char [] ary2 = str2.toCharArray();
		char [] ansary = new char [str1.length() + str2.length()];

		for(int i=0;i<ary1.length;i++)
			ansary[i] = ary1[i];
			
		for(int i=0;i<ary2.length;i++)
			ansary[ary1.length+i] = ary2[i];
	        String ans = new String(ansary);
		return ans;	       
	}

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		System.out.println(str1.concat(str2));
		System.out.println(myConcatMethod(str1,str2));
	}
}
