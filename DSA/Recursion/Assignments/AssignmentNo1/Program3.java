class Demo {

        static int fun(int x) {

		if(x > 0)
			fun()
        }

        public static void main(String [] ecc) {
       
		int sum = 0;

                for(int i=10;i>=1;i--)
                        sum += i;
		
		System.out.println(sum);
                System.out.println(fun(10));
        }
} 
