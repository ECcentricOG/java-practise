class Demo{

	public static void main(String [] args){

		StringBuffer sb = new StringBuffer(20);
		sb.append("Umesh");
		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("Unde");
		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("is ECcentricOG");
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
