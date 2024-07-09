class Demo{

	static int x = 10;

	static {

		static int y =20;  //Error
	}

	void fun(){

		static int z = 30;  //Error
	}

	static void fun2(){

		static int u = 40;  //Error
	}
}
