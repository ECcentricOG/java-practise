class Match {

	void matchType() {

		System.out.println("T20/ODI/Test");
	}
}

class IPLMatch extends Match {

	void matchType() {

		System.out.println("T20");
	}
}
class TestMatch extends Match {

	void matchType() {

		System.out.println("Test");
	}
}

class Client {

	public static void main(String [] args) {

		Match ipl = new IPLMatch();
		ipl.matchType();

		Match test = new TestMatch();
		test.matchType();
	}
}
