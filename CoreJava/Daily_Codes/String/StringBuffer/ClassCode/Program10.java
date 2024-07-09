// Convert StringBuffer into String & String into StringBuffer
class Demo{

	public static void main(String [] args){

		String str = "Umesh";
		StringBuffer sb = new StringBuffer("ECcentricOG");

		StringBuffer ans1 = new StringBuffer(str);
		System.out.println("String into StringBuffer : "+ans1);

		String ans2 = sb.toString();
		System.out.println("StringBuffer to String : "+ans2);
	}
}
