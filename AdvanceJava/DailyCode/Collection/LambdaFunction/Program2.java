interface Core2Web {

	String lang(int numCourse);
}

class Demo {

	public static void main(String [] ecc) {

		Core2Web c2w = (num) ->
			"Java"+" : "+num;

		System.out.println(c2w.lang(3));
	}
}
