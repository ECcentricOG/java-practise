interface Demo1 {

        void fun();
}

interface Demo2 {

        void fun();
}

class Child implements Demo1,Demo2 {

        public void fun() {

                System.out.println("In fun");
        }
}

class Client {

        public static void main(String [] args) {

                Child obj = new Child();
                obj.fun();
        }
}

