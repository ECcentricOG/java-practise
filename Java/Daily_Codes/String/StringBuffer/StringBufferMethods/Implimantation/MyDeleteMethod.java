class Demo{

	static StringBuffer myDelete(StringBuffer sb,int start,int end){

		String str = sb.toString();
		char [] ary  = str.toCharArray();
		int size = ary.length-(end-start);
		char total [] = new char[size];

		for(int i=0;i<start;i++){

			total[i] = ary[i];
		}
		int j=0;
		for(int i=end;i<ary.length;i++){

			total[start+j] = ary[i];
		       	j++;	
		}

		String temp = new String(total);
		StringBuffer ans = new StringBuffer(temp);
		return ans;
	}

	public static void main(String [] args){

		StringBuffer sb = new StringBuffer("ECcentricOG");
		System.out.println(myDelete(sb,2,9));
	}
}
