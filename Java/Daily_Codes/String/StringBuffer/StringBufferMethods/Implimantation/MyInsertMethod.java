class Demo{

	static StringBuffer myInsert(StringBuffer sb,int index,String str){

		String tempStr = sb.toString();
		char [] ary1 = tempStr.toCharArray();
		char [] ary2 = str.toCharArray();

		int size = ary1.length + ary2.length;
		char [] total = new char[size];
		int stop = ary1.length - index;
		
		for(int i=0;i<index;i++){

			total [i] = ary1[i];
		}

		for(int i=0;i<ary2.length;i++){

			total[index+i] = ary2[i];
		}
		int a = index + ary2.length;
		int j = 0;
		for(int i=index;i<ary1.length;i++){

			total[a+j] = ary1[i];
			j++;
		}
		String temp = new String(total);
		StringBuffer ans = new StringBuffer(temp);
		return ans;
	}

	public static void main(String [] args){


		StringBuffer sb = new StringBuffer("Ush");
		System.out.println(myInsert(sb,1,"me"));
	}
}

