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
		int k=sc.nextInt();
		String st=sc.next();
		char[] chr=st.toCharArray();
		if(k==1)
			{ System.out.println(st);
			  return;
			}

		    Arrays.sort(chr);
		    //if possible
		    for(int i=0;i<chr.length;)
		    {
		    	if(i+k-1<chr.length&&chr[i]==chr[i+k-1])
		    	{
		    	   i+=k;
		    		continue;

		    	}
		    	else{
		    		System.out.println(-1);
		    		return;
		    	}

		    }

		    //make the string
		    int n=k-1;
		    String ans="";
		    while(n!=-1)
		    {

		     for(int i=n;i<chr.length;)
		     {
		      ans+=Character.toString(chr[i]);
		      i+=k;
		     }
		     n--;

		   }

		   System.out.println(ans);



		
	}
}