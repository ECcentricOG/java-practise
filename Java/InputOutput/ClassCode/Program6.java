import java.util.*;
import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		StringTokenizer stz = new StringTokenizer(str," ");

		System.out.println(stz.countTokens());

		while(stz.hasMoreTokens()){

			System.out.println(stz.nextToken());
		}
	}
}
