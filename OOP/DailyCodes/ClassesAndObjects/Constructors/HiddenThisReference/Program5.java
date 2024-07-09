class Demo{

	Demo(){

		this(59);
		System.out.println("No-Args Constructor");
	}

	Demo(int x){

		this();
		System.out.println("Para Constructor");
	}
}
/*error: recursive constructor invocation
	Demo(){
	^
*/
