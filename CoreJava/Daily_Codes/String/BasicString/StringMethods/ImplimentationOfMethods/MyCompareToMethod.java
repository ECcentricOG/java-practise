import java.io.*;
class Demo{

	static int myCompareToMethod(String str1 , String str2){

		char [] ary1 = str1.toCharArray();
		char [] ary2 = str2.toCharArray();

		int count = 0;

		for(int i=0;i<ary1.length && i<ary2.length ;i++){

			if(ary1[i] != ary2[i])
				return ary1[i] - ary2[i];
			else 
				count++;
		}

		if(count == ary1.length || count == ary2.length)
			return ary1.length - ary2.length;

		return 0;
	}


	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		System.out.println(str1.compareTo(str2));
		System.out.println(myCompareToMethod(str1,str2));
	}
}
