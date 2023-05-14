class Demo{

	int x = 10;
	static int y = 20;

	void fun(){

		int z = 30;
	}
}

/* After Compilation -->
 *
 * class Demo{
 *
 * 	int x;
 * 	static int y;
 *
 * 	Demo(){
 *
 * 		super(); 	(invokespecial)
 * 		x = 10;		(bipush)	
 * 	}
 *
 * 	void fun(){
 *
 *		int z = 30;	(bipush)
 * 	}
 *
 * 	static{
 *	
 *		y = 20;		(bipush)
 * 	}
 * }
 */

