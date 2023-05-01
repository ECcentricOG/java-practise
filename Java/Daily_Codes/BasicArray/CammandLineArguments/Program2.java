class Demo{

	public static void main(String [] args){

		int n = args.length;
		int [] ary = new int[n];
		
		for(int i=0;i<args.length;i++){

			ary[i] = Integer.parseInt(args[i]);
		}

		int sum = 0;
		for(int i=0;i<ary.length;i++){
			
			sum = sum + ary[i];
		}
		System.out.println(sum);
	}
}
