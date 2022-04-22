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
		st=st.replaceAll("[aeiouyAEIOUY]","");
		st=st.toLowerCase();
		String temp="";
		for(int i=0;i<st.length();i++){

		temp+="."+Character.toString(st.charAt(i));

		}
		System.out.println(temp);
		
	}
}