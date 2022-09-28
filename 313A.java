  import java.util.*;
    import java.io.*;
    public class Viktor{
        public static void main(String args[]){
     
            if (System.getProperty("ONLINE_JUDGE") == null)
            {
                try{if (System.getProperty("ONLINE_JUDGE") == null)
                    System.setIn(new FileInputStream("input.txt"));
                    System.setOut(new PrintStream(new FileOutputStream("output.txt")));
                }
                catch(Exception ex){
                    System.err.println("Error\t"+ex);
                }
            }
            Scanner sc=new Scanner(System.in);
            String st=sc.nextLine();
            String s1=st.charAt(st.length()-1)+"";
            String s2=st.charAt(st.length()-2)+"";
    

            if(st.charAt(0)=='-')

            {
                if(s1.compareTo(s2)>0)
                   st=st.substring(0, st.length()-1);
           
            else
                st=st.substring(0,st.length()-2)+st.substring(st.length()-1);
           }
            if(st.compareTo("-0")==0)
                st="0";
            System.out.println(st);
        }
    }