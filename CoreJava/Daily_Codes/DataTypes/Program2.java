class DataTypes{
	
	public static void main(String [] args){
	
		byte var1 = 10;
		byte var2 = 20;

		float var3 = 10.03f;
		float var4 = 20.45f;

		var1  = var1 + var2;
		var3 = var3 + var4;

		System.out.println(var1);
		System.out.println(var3);
	}

}


//incompatible types: possible lossy conversion from int to byte
//		var1  = var1 + var2;

//incompatible types: possible lossy conversion from double to float
//		var3  = var3 + var4;

