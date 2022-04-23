import java.util.*;
import java.io.*;
public class Viktor{
	public static void main(String args[]){

		if (System.getProperty("ONLINE_JUDGE") == null)
		{
			try{if (System.getProperty("ONLINE_JUDGE") == null)
				System.setIn(new FileInputStream("input_new.txt"));
				System.setOut(new PrintStream(new FileOutputStream("output_new.txt")));
			}
			catch(Exception ex){
				System.err.println("Error\t"+ex);
			}
		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		patter(n);
		
	}

	public static void patter(int n)

	{
		int loop=1;
		int start=n;
		int end=n;

        int k=0; int count=0;
		while(loop!=2*n+2)
		{

			//starting gap
			for(int i=0;i<2*start;i++){
				System.out.print(" ");
			}

				 k=0; count=0;
			//mid elements
			for(int ki=start;ki<=end;ki++)
			{
               if(ki!=end)
				System.out.print(k+" ");
				else
				System.out.print(k);
				

				if(count>=(end-start+1)/2)
					k--;
				else
					k++;
				count++;
			}

			//start and end position difference in mid
			if(loop>n)
				{
				  start++;end--;
				}
			else
				{
					start--;end++;

				}

				//end spaces

				

				System.out.println();
				loop++;


		}


	}
}
