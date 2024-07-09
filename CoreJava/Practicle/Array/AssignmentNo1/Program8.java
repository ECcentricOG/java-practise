import java.io.*;
class Demo{

        public static void main(String [] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Array Size : ");
                int n = Integer.parseInt(br.readLine());

                int ary[] = new int[n];
		int [] ans = new int[n];

		int visited  = -1;

                for(int i=0;i<ary.length;i++) {

                        ary[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0;i<ary.length;i++) {

			int count = 1;

			for(int j=i+1;j<ary.length;j++) {

				if(ary[i] == ary[j]){

					count++;
					ans[j] = visited;
				}
				if(ans[i] != visited){

					ans[i] = count;
				}
			}
		}

		for(int i=0;i<ans.length;i++){

			if(ans[i] != visited){

				System.out.println("frequency of "+ary[i]+" is "+ans[i]);
			}
		}
	}
}

