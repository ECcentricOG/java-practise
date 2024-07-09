class Demo{

	int fun(int x){

		return x;
	}

	float fun(int y){ 		//Overloading doesnot depend on return type

		return y;
	}
}
/*
 * method fun(int) is already defined in class Demo
	float fun(int y){ 		//Overloading doesnot depend on return type
	      ^
*/

