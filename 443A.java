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
            Set<Character> hash=new HashSet<Character>();
            for(int i=0;i<st.length();i++){
                char ch=st.charAt(i);
                    if(ch>='a'&&ch<='z')
                    hash.add(ch);
            }       

            System.out.println(hash.size());
        }
    }