import java.io.*;

class Demo{

	static void add(int a,int b){
		
		int ans = a+b;
		System.out.println("Addition : "+ans);
	}

	static void sub(int a,int b){

		int ans = a-b;
		System.out.println("Substaction : "+ans);
	}

	void mult(int a,int b){

		int ans = a*b;
		System.out.println("Multiplication :"+ans);
	}

	void div(int a,int b){

		float ans = (float)a/(float)b;
		System.out.println("Division : "+ans);
	}

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Demo obj = new Demo();

		System.out.print("Enter 2 Numbers :");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		add(num1,num2);
		sub(num1,num2);
		obj.mult(num1,num2);
		obj.div(num1,num2);

	}
}
