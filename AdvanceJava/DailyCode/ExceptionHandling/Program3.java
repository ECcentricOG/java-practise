import java.io.*;

class Demo {

	public static void main(String [] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name = null;
		int id = 0;

		try{

			name = br.readLine();

			try{
				id = Integer.parseInt(br.readLine());
			}catch(NumberFormatException e) {
	
				System.out.println("Please Enter a Numeric Value");
				try{
					id = Integer.parseInt(br.readLine());
				}catch(NumberFormatException ne) {
					
					System.out.println("A Vedya bat ka grip");
				}
			}

		}catch(IOException e){

			System.out.println(e.getMessage());
		}finally{

			System.out.println("Connection Closed");
		}
	}
}
