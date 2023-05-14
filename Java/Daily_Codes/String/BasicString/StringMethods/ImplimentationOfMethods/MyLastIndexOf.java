class Demo{

	static int myLastIndexOf(String str,char ch){

		char [] ary = str.toCharArray();
		int ans = 0;
		boolean findans = false;
		for(int i=0;i<ary.length;i++){

			if(ch == ary[i]){
				ans = i;
				findans = true;
			}
		}
		if(findans)
			return ans;
		return -1;
	}

	static int myLastIndexOf(String str,char ch,int limit){

		char [] ary = str.toCharArray();
		int ans = 0;
		boolean isans = false;
		for(int i=0;i<limit;i++){

			if(ch == ary[i]){

				ans = i;
				isans = true;

			}
		}
		if(isans)
			return ans;
		return -1;
	}

	public static void main(String [] args){


		String str = "ECcentricOG";

		System.out.println(str.lastIndexOf('c'));
		System.out.println(myLastIndexOf(str,'c'));

		System.out.println(str.lastIndexOf('c',4));
		System.out.println(myLastIndexOf(str,'c',4));
	}
}
