import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a No : ");
		System.out.print("Real Part : ");
		int r1 = Integer.parseInt(br.readLine());
		System.out.print("Imaginary Part : ");
		int i1 = Integer.parseInt(br.readLine());

		System.out.println("Enter a No : ");
                System.out.print("Real Part : ");
                int r2 = Integer.parseInt(br.readLine());
                System.out.print("Imaginary Part : ");
                int i2 = Integer.parseInt(br.readLine());

		System.out.println("The Addition of "+r1+"+"+i1+"i"+" and "+r2+"+"+i2+"i"+" is "+(r1+r2)+"+"+(i1+i2)+"i");

	}
}
