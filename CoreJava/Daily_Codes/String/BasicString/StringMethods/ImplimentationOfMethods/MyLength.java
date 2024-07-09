class Demo{
 
 	static int myLength(String s){
 
 		char [] ary = s.toCharArray();
 		int length = ary.length;
 
 		return length;
 	}
 
 	public static void main(String [] args){
 
 		String str = "Umesh";
  		System.out.println(myLength(str));
	}
} 
