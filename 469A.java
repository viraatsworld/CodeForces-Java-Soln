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
            Set<Integer> intSet=new HashSet<Integer>();
            int level=sc.nextInt();
            int m=sc.nextInt();
            for(int i=0;i<m;i++)
                intSet.add(sc.nextInt());
            int n=sc.nextInt();

                for(int i=0;i<n;i++)
                intSet.add(sc.nextInt());      


                if(level==intSet.size())
                    System.out.println("I become the guy.");
                else
                    System.out.println("Oh, my keyboard!");



                         }
    }
