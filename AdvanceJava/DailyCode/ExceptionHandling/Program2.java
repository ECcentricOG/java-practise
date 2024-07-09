import java.io.*;
class Demo {

	public static void main(String [] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Start");
		int a = 0;
		String str = null;

		try{
			str = br.readLine();
			a = Integer.parseInt(br.readLine());
		}catch(Exception e){

			System.out.println("Please enter int value");

			try{
				a = Integer.parseInt(br.readLine());
			}catch(Exception f){

				System.out.println("Fuck you Nko deu BC");
			}finally{


				System.out.println("I am Here ");
			}

		}

		System.out.println("End");
	}
}
