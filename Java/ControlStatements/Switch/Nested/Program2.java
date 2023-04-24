// Real life switch example

class Demo{

	public static void main(String [] args){

		String str = "Nike";

		System.out.println("Shoe Mania");

		switch(str){

			case "Adidas":{

					      String str1 = "High Top";


					      switch(str1){

					   		 case "Low Top":
						     		 System.out.println("Low Top");
						     		 break;

					     		 case "Mid Top":
						       		 System.out.println("Mid Top");
						     		 break;

					     	     	 case "High Top":
							     	 System.out.println("High Top");
							     	 break;
				              }
			}
			break;

			case "Nike":{

					    String str1 = "Mid Top";

					    switch(str1){

						    	case "Low Top":
							   	System.out.println("Low Top");
							   	break;

							case "Mid Top":
								System.out.println("Mid Top");
								break;

							case "High Top":
								System.out.println("High Top");
								break;
						    
					    }
			}
			break;
		}
	}
}
