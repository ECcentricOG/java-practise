import java.io.*;
class Demo{

	static int myCompareTo(String str1,String str2){

		char ary1 [] = str1.toCharArray();
		char ary2 [] = str2.toCharArray();
		int ans = -1;
		boolean isAns = false;
		if(str1.equals(str2)){

			ans = 0;
		}else{

			for(int i=0;i<ary1.length;i++){

				for(int j=i;j<ary2.length;j++){

					int num1 = ary1[i];
					int num2 = ary2[j];
					if(ary1.length == ary2.length){

						if(num1 == num2) {

							ans = 0;			
						}else{
							
							isAns = true;
							ans = num1 - num2;
							break;
						}
					}else{
				
						ans = ary1.length - ary2.length;
					}
				}
				if(isAns){

					break;
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
