class Demo{

	static int myIndexOfMethod(String str,int start,char ch){

		char [] ary = str.toCharArray();

		for(int i=start;i<ary.length;i++){

			if(ch == ary[i]){
			
				return i;
			}
		}
		return -1;
	}

	static int myIndexOfMethod(String str,char ch){

		char [] ary = str.toCharArray();

		for(int i=0;i<ary.length;i++){

			if(ch == ary[i]){
				return i;
			}
		}
		return -1;
	}

	public static void main(String [] args){

		String str = "ECcentricOG";

		System.out.println(str.indexOf('c'));
		System.out.println(myIndexOfMethod(str,'c'));

		System.out.println(str.indexOf('c',3));
		System.out.println(myIndexOfMethod(str,3,'c'));
	}
}
