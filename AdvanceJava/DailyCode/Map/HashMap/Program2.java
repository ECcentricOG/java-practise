import java.util.*;
class Demo {
        
        public static void main(String [] ecc) {
        
                HashMap hm= new HashMap();

                hm.put("Umesh","Brazzers");
                hm.put("Saprem","Microsoft");
                hm.put("Pritam","Google");
                hm.put("Sarvesh","Deloitte");

                System.out.println(hm);

		// V get(K);
		System.out.println(hm.get("Umesh"));

		// Set keySet();
		System.out.println(hm.keySet());

		// Collection values();
		System.out.println(hm.values());

		// Set entrySet();
		System.out.println(hm.entrySet());

		// V remove(K);
		System.out.println(hm.remove("Pritam"));
        }
}    
