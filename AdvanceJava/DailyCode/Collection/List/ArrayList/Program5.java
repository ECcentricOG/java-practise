import java.util.*;

class Player {

	String name = null;

	Player(String name) {

		this.name = name;
	}

	public String toString() {

		return name;
	}
}

class Demo {

	public static void main(String [] ecc) {

		ArrayList al = new ArrayList ();
		al.add(new Player("Messi"));
		al.add(new Player("Pele"));
		al.add(new Player("Maradona"));
		al.add(new Player("Ronaldo"));

		System.out.println(al);
	}
}
