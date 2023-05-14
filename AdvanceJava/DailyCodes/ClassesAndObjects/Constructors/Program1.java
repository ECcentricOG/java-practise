class Demo{

	int age = 10;
	int jerNo = 18;

	void fun(){

		int x = 10;
	}
}

/* After Compilation :--->
 *
 * class Demo{
 *	
 *	int age;
 *	int jerNo;
 *	
 * 	Demo(){
 *
 * 		super()  	(invokespecial) ---it calls the constructor of parent class
 *		age = 10; 	(bipush)
 *		jerNo = 18 	(bipush)
 * 	}
 *
 * 	void fun(){
 *
 * 		int x = 10;
 * 	}
 * }
 */

