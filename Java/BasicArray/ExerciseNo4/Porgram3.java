import java.io.*;
class Solution{

	static boolean compNo(int x){

		int count = 0;
		boolean isComp = false;

		for(int i=1;i<=x;i++){

			if(x%i == 0){

				count++;
			}

			if(count == 3){

				break;
			}
		}

		if(count == 3){

			 isComp = true;
		}

		return isComp;
	}

        public static void main(String [] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Arrat Size : ");
                int n = Integer.parseInt(br.readLine());
                int [] ary = new int [n];
                for(int i=0;i<ary.length;i++){

                        ary[i] = Integer.parseInt(br.readLine());
                }
		
		for(int i=0;i<ary.length;i++){

			if(compNo(ary[i])){

				System.out.println("Composite "+ary[i]+" found at index : "+i);
			}
		}
        }       
}   
