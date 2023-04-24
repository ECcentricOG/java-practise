class DataTypes{

        public static void main(String [] args){

        byte a = 10;		 // size = 1 byte , range = 2^8
        short b = 20;		 // size = 2 byte , range = 2^16    
        int c = 30;		 // size = 4 byte , range = 2^32  	 Default
        long d = 50;		 // size = 8 byte , range = 2^64
        float e  = 10.45f;	 // size = 4 byte
        double f = 45.567d;	 // size = 8 byte          		 Default
        char g = 'U';		 // size = 2 byte 
        boolean h = true;	 // size = 1 bit
	
	System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
}
}

