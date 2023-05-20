class Apple{

	String produCategory = "HandSet";
	float price = 130000.0f;

	void options(){

		String modelName = "ProMax";
		int noOfColors = 5;
		System.out.println(modelName);
	}

	void payment(){

		String paymentMode = "Online";
		System.out.println(price);
	}
}

class Customer{

	public static void main(String [] args){

		Apple obj = new Apple();
		obj.options();
		obj.payment();
	}
}
