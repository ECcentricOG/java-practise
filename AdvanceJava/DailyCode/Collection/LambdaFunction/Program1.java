interface Core2Web {

	void lang();
}

class Demo {

	public static void main(String [] ecc) {

		Core2Web c2w = () -> {

			System.out.println("Java");
		};

		c2w.lang();
	}
}
