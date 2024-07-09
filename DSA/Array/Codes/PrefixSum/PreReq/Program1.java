/*
	Given an index of size N and Q number of queries.Query contain two parameters(s,e)
	s ->  start
	e -> end
	for all queries print the sum of all elements from index s to e.

	Arr [-3,6,2,4,5,2,8,-9,3]
	N = 10
	Q = 3

	Queries		s	e	Sum

	  Q1		1	3	12
	  Q2		2	7	12
	  Q3		1	1	6
*/

import java.util.*;
class Demo {


		static int rangeSum(int [] arr,int s,int e) {

			int sum = 0;

			for(int i=s;i<=e;i++)
				sum += arr[i];
			return sum;
		}

		public static void main(String [] ecc) {

			int [] arr = new int[] {-3,6,2,4,5,2,8,-9,3};

			Scanner sc = new Scanner(System.in);
			int Q = sc.nextInt();
			for(int i=1;i<=Q;i++) {

				int s = sc.nextInt();
				int e = sc.nextInt();
				System.out.println(rangeSum(arr,s,e));
			}
		}
}
