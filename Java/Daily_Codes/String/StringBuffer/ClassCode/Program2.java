class Demo{

	public static void main(String [] args){

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb = sb.append("ECcentricOG");
		System.out.println(sb.capacity());
		sb = sb.append("GoodGame");
		System.out.println(sb.capacity());
		sb = sb.append("ZaleKaJ1");
		System.out.println(sb.capacity());
		sb = sb.append("MgAtta");
		System.out.println(sb.capacity());
		sb = sb.append("TheWay");
		System.out.println(sb.capacity());

		System.out.println(sb.length());
	}
}
