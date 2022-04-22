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
		System.out.print(n+" ");
		permutation(n-1);
		
	}

	public static void permutation(int n){

	if(n==0)
		return;

	if(n==1)
	{
		System.out.print(n+" ");
		return;
	}
	
	else{
			
			permutation(n-1);
			System.out.print(n+" ");
	}



	}
}