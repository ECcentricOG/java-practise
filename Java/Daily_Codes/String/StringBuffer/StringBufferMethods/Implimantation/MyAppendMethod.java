class Demo{

	static StringBuffer myAppend(StringBuffer str,String str2){
	
		String str1 = str.toString();
		char [] ary1 = str1.toCharArray();
		char [] ary2 = str2.toCharArray();
		int size = ary1.length + ary2.length;
		char [] total = new char[size];

		for(int i=0;i<ary1.length;i++){

			total[i] = ary1[i];
		}

		for(int i=0;i<ary2.length;i++){

			total[ary1.length+i] = ary2[i];
		}

		String temp = new String(total);
		StringBuffer ans = new StringBuffer(temp); 
		return ans;
	}

	public static void main(String [] args){


		StringBuffer sb = new StringBuffer("Umesh");
	
		System.out.println(myAppend(sb,"Unde"));
	}
}
