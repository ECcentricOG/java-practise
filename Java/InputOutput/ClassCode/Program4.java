/* Take an Input from user on same line and make it visible on different categories  */
import java.util.*;
import java.io.*;

class Demo{

	public static void main(String [] aegs)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Match Info,Man of the Match,Goals");
		String info = br.readLine();

		StringTokenizer stz = new StringTokenizer(info,",");

		String token1 = stz.nextToken();
		String token2 = stz.nextToken();
		int token3 = Integer.parseInt(stz.nextToken());

		System.out.println("Match : "+token1);
		System.out.println("MOTM : "+token2);
		System.out.println("Goals : "+token3);		
	}
}

