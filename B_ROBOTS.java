//THIS IS A PROBLEM B OF EDUCATION CODEFORCES ROUND 128(DIV2)
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
		int test=sc.nextInt();
		int index=0;
		while(test>0){
		test--;
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] arr=new char[n][m];
		String[] str=new String[n*m];
		index=0;
		for(int i=0;i<n;i++){
			String st=sc.next();
			for(int j=0;j<m;j++){
			arr[i][j]=st.charAt(j);
			if(arr[i][j]=='R')
				str[index++]=""+i+j;
			}
		}
		solve(n,m,str,arr);
		
		}

		
	}

	public static void solve(int n, int m, String[] str, char[][] arr){
		boolean flagl=false,flagu=false;
		while(flagl!=true||flagu!=true){
			if(arr[0][0]=='R')
			{
				System.out.println("YES");
				return;
			}
			if(flagl==false)
			//check left move for robot
			for(int k=0;k<str.length;k++){

				if(str[k]==null||str[k]=="")
					break;
				int j=Integer.parseInt(str[k].substring(1));
				if(j-1>=0)
					continue;
				else
					{flagl=true;
					 break;
					}
			}
			
			//move robot left
				if(flagl==false)
				{
					for(int k=0;k<str.length;k++){

						if(str[k]==null||str[k]=="")
							break;
						int i=Integer.parseInt(str[k].substring(0,1));
						int j=Integer.parseInt(str[k].substring(1));
						//arr[i][j]='E';
						j=j-1;
						arr[i][j]='R';
						str[k]=""+i+j;
						

					}
				}
				/***
				//printing after left move
				System.out.println("Moving left "+flagl);
				for(int i=0;i<arr.length;i++){
					for(int j=0;j<arr[i].length;j++){
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}
				**/

			//check after left move
			if(arr[0][0]=='R'){

				System.out.println("YES");
				return;
			}

			if(flagu==false)
			//check up move for robot
			for(int k=0;k<str.length;k++){

			if(str[k]==null||str[k]=="")
						break;
				int i=Integer.parseInt(str[k].substring(0,1));
				//int j=Integer.parseInt(str[k].substring(1));

				if(i-1>=0)
					continue;
				else
					{flagu=true;
					 break;
					}
			}

			//move robot up
			if(flagu==false)
				{
					for(int k=0;k<str.length;k++){

						if(str[k]==null||str[k]=="")
							break;
						int i=Integer.parseInt(str[k].substring(0,1));
						int j=Integer.parseInt(str[k].substring(1));
						//arr[i][j]='E';
						i=i-1;
						arr[i][j]='R';
						str[k]=""+i+j;
					
					}
				}

				/***
				//printing after up move
				System.out.println("Moving UP "+flagu);
				for(int i=0;i<arr.length;i++){
					for(int j=0;j<arr[i].length;j++){
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}

				**/
				

			//check after up move
			if(arr[0][0]=='R'){

				System.out.println("YES");
				return;
			}

		}
		System.out.println("NO");
	}
}