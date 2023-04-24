class DataTypes{
	
	int x = 10;			//instance variable (there is no global variable in java)

	public static void main(String [] args){
	
		int y = 20;

		System.out.println(x+" "+y);
	}
}

//Program3.java:9: error: non-static variable x cannot be referenced from a static context
//		System.out.println(x+" "+y);
//		                   ^


// There are 2 types of access the methods or variables. 
// 1) Using Static keyword.
// 2) Making object file of the class which contain the variable.

