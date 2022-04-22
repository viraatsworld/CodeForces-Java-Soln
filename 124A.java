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
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int count=0;



		for(int i=a;i<n;i++){
		if(n-1-i<=b)
			count++;
		}

		System.out.println(count);
		
	}
}