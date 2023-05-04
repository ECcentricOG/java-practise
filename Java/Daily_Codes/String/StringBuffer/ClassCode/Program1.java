class Demo{

	public static void main(String [] args){

		StringBuffer sb = new StringBuffer("Umesh");
		System.out.println(System.identityHashCode(sb));
		sb = sb.append("Unde");
		System.out.println(System.identityHashCode(sb));
	}
}
