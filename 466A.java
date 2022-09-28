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
            int rides=sc.nextInt();
            int mrides=sc.nextInt();
            int oride=sc.nextInt();
            int pmrides=sc.nextInt();

                int check=0;

                int need=rides/mrides;

            if(need==0){

                check=Math.min(rides*oride, pmrides);

            }
            else if(rides%mrides==0)
                {
                    check=Math.min(need*pmrides,rides*oride);
                    
                }
            else{
                    int ma=rides-(mrides*need); 
                    check=Math.min((need*pmrides+ma*oride), rides*oride);
                    check=Math.min(check, need*pmrides+pmrides);
            }
                    System.out.println(check);  

        }
    }
    