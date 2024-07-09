abstract class LaLiga {

	void rules() {

		System.out.println("Must be 11 player in the team");
	}

	abstract void teamCaptain();
}

class FCBarcelona extends LaLiga {

	void teamCaptain() {

		System.out.println("Pedri");
	}
}

class Fan {

	public static void main(String [] args) {

		LaLiga team = new FCBarcelona();
		team.teamCaptain();
	}
}

