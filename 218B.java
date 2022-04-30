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

		int max=maximum(n,arr);
		int min=minimum(n,arr);
		System.out.println(max+" "+min);
		
	}

	public static int maximum(int n,int[] arr){
	int loop=0,sum=0,index=arr.length-1;
	int[] b=arr.clone();
	while(loop<n){
	Arrays.sort(b);


		if(b[index]==0)
			{
			index--;
			sum+=b[index];
			b[index]--;
			}
		else
			{sum+=b[index];
				b[index]--;
			}

		//if(index==-1)
		//	index=arr.length-1;

		loop++;
	}

	return sum;

	}


	public static int minimum(int n, int[] arr){

	int loop=0,sum=0,index=0;
	while(loop<n){
	Arrays.sort(arr);
		if(arr[index]==0)
			{
			index++;
			sum+=arr[index];
			arr[index]--;
			}
		else
			{sum+=arr[index];
				arr[index]--;
			}

		//if(index==arr.length)
		//	index=0;

		loop++;
	  }

	  return sum;
	}
}