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
		long[] arr=new long[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLong();
		}

		Flowers(n,arr);
		
	}

	public static void Flowers(int n,long[] arr){

	Arrays.sort(arr);
	long max=arr[arr.length-1];
	long min=arr[0];
	long nmax=0;
	long nmin=0;
	for(int i=0;i<n;i++){
		if(arr[i]==max)
			nmax++;
		else if(arr[i]==min)
			nmin++;
	}
	if(max==min)
	System.out.println(max-min+" "+((nmax*(nmax-1))/2));
	else
		System.out.println(max-min+" "+nmax*nmin);
	}
}