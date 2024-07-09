import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter No of Over : ");
		int n = Integer.parseInt(br.readLine());

		int total = 0;
		int four = 0;
		int six = 0;
		int balls = 0;
		int other = 0;

		int [][] ary = new int [n][6];

		for(int i=0;i<ary.length;i++){

			for(int j=0;j<ary[i].length;j++){

				ary[i][j] = Integer.parseInt(br.readLine());

				if(ary[i][j] == 4)
					four++;

				else if(ary[i][j] == 6)
					six++;

				else if(ary[i][j] != 5)
					other++;

				total += ary[i][j];

				balls++;

			}
		}

		System.out.println("Total Score : "+total);
		System.out.println("Total Balls : "+balls);
		System.out.println("Total Sixes : "+six);
		System.out.println("Total Four : "+four);
		System.out.println("Total Other : "+other);
	}
}
