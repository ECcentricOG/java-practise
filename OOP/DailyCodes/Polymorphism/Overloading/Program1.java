class Demo{

	void fun(int x){  			//method signature fun(int)

		System.out.println(x);
	}

	void fun(int y){			//method signature fun(int)

		System.out.println(y);
	}
}

/*method fun(int) is already defined in class Demo
	void fun(int y){			//method signature fun(int)
	     ^
*/
