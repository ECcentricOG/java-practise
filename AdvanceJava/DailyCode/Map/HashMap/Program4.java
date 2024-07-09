import java.util.*;
class Demo {
        
        public static void main(String [] ecc) {
        
                HashMap hm= new HashMap();

                hm.put("Umesh","Accenture");
                hm.put("Saprem","Accenture");
                hm.put("Abhijeet","Accenture"); // Duplicate Values are Allowed but duplicate keys are not
                hm.put("Sarvesh","Deloitte");

                System.out.println(hm);
        }
}    
