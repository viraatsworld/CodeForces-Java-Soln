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

		String str="";
		for(int i=0;i<st.length();i++){
			if(str.length()==0&&st.charAt(i)=='h')
			str+=st.charAt(i);

			else if(str.length()>0&&str.substring(0).compareTo("h")==0&&st.charAt(i)=='e')
				str+=st.charAt(i);

			else if(str.length()>1&&str.substring(0).compareTo("he")==0&&st.charAt(i)=='l')
			str+=st.charAt(i);

			else if(str.length()>2&&str.substring(0).compareTo("hel")==0&&st.charAt(i)=='l')
			str+=st.charAt(i);

			else if(str.length()>3&&str.substring(0).compareTo("hell")==0&&st.charAt(i)=='o')
				str+=st.charAt(i);

			else if(str.compareTo("hello")==0)
					break;
		}

		if(str.compareTo("hello")==0)
			System.out.println("YES");
		else
			System.out.println("NO");

		
	}
}