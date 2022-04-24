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
		int s=sc.nextInt();
		int n=sc.nextInt();

		int[][] arr=new int[n][2];
		for(int i=0;i<n;i++){
			for(int j=0;j<2;j++){
			 arr[i][j]=sc.nextInt();
			}
		}

		//sorted array based on arr[0]
		Arrays.sort(arr,(a,b)->(a[0]-b[0]));

		for(int i=0;i<n;i++){

			int pow=arr[i][0];
			if(pow<s)
			{
				s=s+arr[i][1];
			}
			else{
				System.out.println("NO");
				return;
			}
			
		}

		System.out.println("YES");		
	}
}