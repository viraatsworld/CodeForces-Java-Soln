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
		String st=sc.next();

		int countz=0;
		int counto=0;

		for(int i=0;i<st.length();i++){
		 if(st.charAt(i)=='0'){
		 	counto=0;
		 	countz++;
		 }
		else{
		 counto++;
		 countz=0;
		}

		if(countz>=7||counto>=7){
			System.out.println("YES");
			return;
		}


		}
		System.out.println("NO");




		
	}
}