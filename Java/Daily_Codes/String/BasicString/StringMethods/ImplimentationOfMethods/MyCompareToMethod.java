import java.io.*;
class Demo{

	static int myCompareTo(String str1,String str2){

		char ary1 [] = str1.toCharArray();
		char ary2 [] = str2.toCharArray();
		int ans = -1;
		for(int i=0;i<ary1.length;i++){

			for(int j=0;j<ary2.length;j++){

				if(ary1.length == ary2.length){

					if(ary1[i] == ary2[j]) {

						ans = 0;			
					}else{

						ans = ary1[i] - ary2[j];
						break;
					}
				}else{

					if(ary1[i] == ary2[j]){

						ans = 0;
					}else{

						ans = ary1[i] - ary2[j];
						break;
					}
				}	
			}
		}
		return ans;
	}
		
	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("String 1 : ");
		String str1 = br.readLine();
		System.out.print("String 2 : ");
		String str2 = br.readLine();

		System.out.println(str1.compareTo(str2));
		System.out.println(myCompareTo(str1,str2));
	}
}
