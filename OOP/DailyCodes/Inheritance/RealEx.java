class Marvel{

	Marvel(){

		System.out.println("Avengers");
	}

	void type(){

		System.out.println("Superhero");
	}
}

class IronMan extends Marvel{

	IronMan(){

		System.out.println("Tony Stark");
		System.out.println("Genius,Billionaire,Playboy,Philanthropist");
	}
}

class Fan{

	public static void main(String [] args){

		IronMan suit = new IronMan();
		suit.type();
	}
}
