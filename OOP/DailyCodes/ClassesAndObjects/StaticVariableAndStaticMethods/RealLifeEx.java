class Football{

	static String club = "FC Barcelona";
	static int noOfPlayers = 25;
	static String captain = "Sergio Busquets";
	String playerName = "Pedri";
	int jerNo = 8;
	
	static void clubInfo(){

		System.out.println("Club Name : "+club);
		System.out.println("Total No of Players : "+noOfPlayers);
		System.out.println("Team Captain : "+captain);
	}

	void playerInfo(){

		System.out.println("Club Name : "+club);
		System.out.println("Player Name : "+playerName);
		System.out.println("Jer No : "+jerNo);
	}
}

class Fan{

	public static void main(String [] args){

		Football fc = new Football();

		fc.clubInfo();
		fc.playerInfo();
	}
}
