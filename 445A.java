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
		int n=sc.nextInt();
		int m=sc.nextInt();

		char[][] arr=new char[n][m];

		//initialize
		for(int i=0;i<n;i++){

				String st=sc.next();
				arr[i]=st.toCharArray();
		}

		chessBoard(m,n,arr);
		//continue the loop till all adjacent elements are different
		while(true)
		{
		chessBoard2(m,n,arr);
		boolean adj=adjacent(m,n,arr);
			if(adj==false)
				break;
		}
		display(arr);		
	}

//initialize all elements with B
	public static void chessBoard(int m,int n,char[][] arr){

	 for(int i=0;i<arr.length;i++)
	  {
		for(int j=0;j<arr[i].length;j++){

		  char ch=arr[i][j];

		  if(ch=='-')
		  	continue;
		  else
		  { 


		  	
		  	 arr[i][j]='B';


		  }
					 
		 }
 
	  }
    }

    //compare and replace elements with correct sequence
    public static void chessBoard2(int m,int n,char[][] arr){

	 for(int i=0;i<arr.length;i++)
	  {
		for(int j=0;j<m;j++){

		  char ch=arr[i][j];

		  if(ch=='-')
		  	continue;
		  else if(ch=='W')

		  { 

		  	//left W
		  	if(j-1>=0&& arr[i][j-1]=='W')
		  		arr[i][j]='B'; 

		  	 //up W
		  	 if(i-1>=0 && arr[i-1][j]=='W')
		  	 arr[i][j]='B';

		  	  //DOWN W
		  	  if(i+1<n && arr[i+1][j]=='W')
		  	 arr[i][j]='B';

			//right W
		  	  if(j+1<m && arr[i][j+1]=='W')
		  	    arr[i][j]='B';
	  	
		  }
		  else{

		  //left B
		  	 if(j-1>=0 && arr[i][j-1]=='B')
		  		arr[i][j]='W';

		   //up B
		  	  if(i-1>=0 && arr[i-1][j]=='B')
		  	 arr[i][j]='W';

		  	 //DOWN B

		  	  if(i+1<n && arr[i+1][j]=='B')
		  	 arr[i][j]='W';

		  	 //right B
		  	 if(j+1<m && arr[i][j+1]=='B')
		  	    arr[i][j]='W';

		  }
					 
		 }
 
	  }
    }
    
    /**function which return true if any element adjacent is same else return false if no element is adjacent. **/
    public static boolean adjacent(int m,int n,char[][] arr){

     	for(int i=0;i<arr.length;i++)

    	{
			for(int j=0;j<arr[i].length;j++)
			{
				char ch=arr[i][j];

				if(ch=='-')
					continue;
			else if(ch=='B'){
					//left B
		  			if(j-1>=0 && arr[i][j-1]=='B')
		  			return true;

		   			//up B
		  			 else if(i-1>=0 && arr[i-1][j]=='B')
		  			 return true;


		  			 //DOWN B

		  			 else if(i+1<n && arr[i+1][j]=='B')
		  			 return true;

		 		 	 //right B
		  			else if(j+1<m && arr[i][j+1]=='B')
		  	 		  return true;

					}
				else{

					//left W
		  		 if(j-1>=0&& arr[i][j-1]=='W')
		  			return true;	 

		  		//up W
		  		else if(i-1>=0 && arr[i-1][j]=='W')
		  		 return true;

		 

		  	 	 //DOWN W
		  	 	else if(i+1<n && arr[i+1][j]=='W')
		  	 	return true;


		  		//right W
		  		else if(j+1<m && arr[i][j+1]=='W')
		  	   	return true;

				}
			}
		}

		return false;

    }

	public static void display(char[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
//Took me almost 30 attemps to get accepted.
//Alternate approach was to put W in odd places and B in even places it is easier than above. 