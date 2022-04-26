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
		int m=sc.nextInt();

		int[] arr=new int[m];

		for(int i=0;i<m;i++){
			arr[i]=sc.nextInt();
		}

		Arrays.sort(arr);

		int start=0, end=n;
		int maxDiff=Integer.MAX_VALUE;

		while(end<=m){

		int diff=arr[end-1]-arr[start];

		if(maxDiff>diff){
		maxDiff=diff;
		}

		start++;
		end++;
		}

		System.out.println(maxDiff);	
	}
}