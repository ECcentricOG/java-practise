import java.util.*;
class Demo {
        
        public static void main(String [] ecc) {
        
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(10);
                al.add(20);
                al.add(30);
		al.add(40);
		al.add(20);

		ArrayList al2 = new ArrayList();
		al2.add(4);
		al2.add(5);
		al2.add(6);

		// Size()
		System.out.println("Size : " + al.size());

		// indexOf(E) 
		System.out.println("Index Of : "+al.indexOf(40));

		//Contains(E)
		System.out.println("Contains : "+al.contains(3));

		// LastIndexOf(E)
		System.out.println("Last Index Of : "+al.lastIndexOf(20));

		//Get(int)
		System.out.println("Get : "+al.get(2));

		//Set(int,E)
		System.out.println("Set : "+al.set(3,33));

		//add(int,E)
		al.add(0,1);

		//Add All(Collection)
		al.addAll(al2);
		System.out.println("Add All : "+al);

		//AddAll(int , Collection)
		al.addAll(0,al2);
		System.out.println("Add ALl Index : "+al);

		//remove(int)
		System.out.println("Remove : "+al.remove(2));

		//removeRange(int , int) Protected
		//al.removeRange(0,3);
		//System.out.println("Remove Range : "+al);

		//toArray
		Object [] arr = al.toArray();
		for(Object x : arr)
			System.out.println(x);

		//clear()
		al.clear();
		System.out.println(al);
        }
}  
