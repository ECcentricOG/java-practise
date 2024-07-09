import java.io.*;
class Demo{

	static boolean strongNo(int x){

		int sum = 0;
		for(int i=x;i>0;i/=10){

			int rem = i%10;
			int fact = 1;

			for(int j=1;j<=rem;j++)
				fact *= j;

			sum += fact;
		}
		if(sum == x)
			return true;
		return false;
	}

        public static void main(String [] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Array Size : ");
                int n = Integer.parseInt(br.readLine());

                int ary[] = new int[n];

                for(int i=0;i<ary.length;i++)
                        ary[i] = Integer.parseInt(br.readLine());

		for(int x : ary){

			if(strongNo(x))
				System.out.println(x);
		}
        }
}

