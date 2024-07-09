import java.util.*;
class Demo {

	public static void main(String [] ecc) {

		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);

		// E getFirst()
		System.out.println("Get First : "+ll.getFirst());

		// E getLast()
		System.out.println("get Last : "+ll.getLast());

		// E removeFirst()
		System.out.println("remove First : "+ll.removeFirst());

		// E removeLast()
		System.out.println("Remove Last : "+ll.removeLast());

		// void addFirst(E)
		ll.addFirst(3);
		System.out.println(ll);

		// void addLast(E)
		ll.addLast(100);
		System.out.println(ll);


	}
}
