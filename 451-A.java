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
            int n=sc.nextInt();
            int m=sc.nextInt();
            int num=Math.min(n,m);
           
            if(num%2==0)
            System.out.println("Malvika");
            else
                 System.out.println("Akshat");
            
    
        }
    }