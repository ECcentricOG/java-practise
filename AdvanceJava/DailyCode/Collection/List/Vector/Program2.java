import java.util.*;

class ADemo {

        public static ArrayList al(){

                ArrayList a = new ArrayList();
                a.add(10);
                a.add(20);
                a.add(30);
                return a;
        }
}

class Demo {

        public static void main(String [] ecc) {


                Vector v = new Vector(ADemo.al());
                System.out.println(v);
        }
}
~              
