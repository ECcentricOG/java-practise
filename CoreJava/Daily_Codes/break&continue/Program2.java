class Demo{

	public static void main(String [] args){
	
		int n = 40;
		
		for(int i=1;i<=n;i++){
		
			if(i%3 == 0){
				break;
			}
			System.out.println(i);
		}
	}
}

/*  i = 1	1<=40--true	1%3 == 0--false		Sop(1);      i++ = 2
 *  i = 2	2<=40--true	2%3 == 0--false		sop(2);      i++ = 3
 *  i = 3	3<=40--true	3%3 == 0--true		Break   
 *
 *  break the loop 
 *
 *  o/p = 1
 *  	  2         */		
