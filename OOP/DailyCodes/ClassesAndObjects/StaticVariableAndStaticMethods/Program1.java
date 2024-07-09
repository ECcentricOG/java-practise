class StaticDemo{

	static int x = 10;
	static int y = 20;
}

/* Afrer Compilation :---->
 *
 *
 * class StaticDemo{
 *
 * 	static int x;
 * 	static int y;
 * 	
 *	StaticDemo(){
 *
 * 		super();
 *	}
 *
 *	static{
 *
 *		x = 10;
 *		y = 20;
 *	}
 * }
 */

