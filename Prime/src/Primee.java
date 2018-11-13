import java.util.Scanner;

public class Primee {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			

			System.out.println("enter no");
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			
			for(int j=2;j<=n;j++)
			{
				while(n%j==0)
				{
					System.out.println(j+ " ");
					n=n/j;
				}
			}
		if(n>2)
		{
			System.out.println(n);
		}

		}



	}


