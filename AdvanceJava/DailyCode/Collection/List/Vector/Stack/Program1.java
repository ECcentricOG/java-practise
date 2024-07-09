import java.util.*;
class Demo {

	public static void main(String [] ecc) {

		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.add(30);

		System.out.println(s);

		s.pop();

		System.out.println(s);

		System.out.println(s.empty());
	}
}
