class Demo{

	public static void main(String [] args){

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb = sb.append("ECcentricOG");
		System.out.println(sb.capacity());
		sb = sb.append("GoodGame");
		System.out.println(sb.capacity());

		StringBuffer sb2 = new StringBuffer("ECcentricOG");
		System.out.println(sb2.capacity());
		System.out.println(sb.length());
	}
}
