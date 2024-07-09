import numbers.operation.*;
import java.util.*;

class Demo {

	public static void main(String [] ecc) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		Addition obj = new Addition();
		int sol = obj.ans(a,b);
		System.out.println(sol);

		System.out.println(Subtraction.ans(a,b));
	}
}
