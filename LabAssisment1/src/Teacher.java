import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Enter First Angle");
			Scanner obj=new Scanner(System.in);
			int x=obj.nextInt();
			System.out.println("Enter second Angle");
			int y=obj.nextInt();
			System.out.println("Enter Third Angle");
			int z=obj.nextInt();
			int a=x+y+z;
			if(a==180)
			{
				System.out.println("1st Price");
			}

			else 
			{
				System.out.println("No prize");
			}     
		}

		
	}


