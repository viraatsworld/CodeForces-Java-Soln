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
            int[][] arr=new int[n][2];

            for(int i=0;i<n;i++){
                
                for(int j=0;j<2;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            int counter=0;
            for(int i=0;i<n;i++){

            int item=arr[i][0];

            for(int j=0;j<n;j++){
                if(item==arr[j][1]) 
                    counter++;
            }
            
            }

            System.out.println(counter);
        }
    }