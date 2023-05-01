class Demo{

	public static void main(String [] args){

		String str = "Netflix";

		System.out.println("Movies");

		switch(str){
		
			case "Prime Video":{

						   String str1 = "Movies";

						   switch(str1){

							   case "Series":
								   System.out.println("Hindi");
								   break;

							   case "Movies":
								   System.out.println("Thriller");
								   break;
						   }
			}
			break;

			case "Netflix":{

					       String str1 = "Movies";

					       switch(str1){

							case "Tv Shows":
								System.out.println("English");
								break;

							case "Movies":
								System.out.println("Hindi");
								break;
					       }
			}
			break;
		}
	}
}
