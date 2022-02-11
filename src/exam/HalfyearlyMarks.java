package exam;

import java.util.Scanner;

public class HalfyearlyMarks {
	public static void main(String[]args) {
		System.out.println("Student Marks");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Student ID  -  ");
		int id=sc.nextInt();
		System.out.print("Enter the Student Name  -  ");
		String name=sc.next();
		System.out.print("Enter the no of subjects -  ");
		int no=sc.nextInt();
		System.out.print("physics mark  -  ");
		int physics1=sc.nextInt();
		System.out.print("Maths mark  -  ");
		int maths=sc.nextInt();
		System.out.print("chemistry mark  -  ");
		int chemistry=sc.nextInt();
		double b;
		b=(physics1+maths+chemistry)/no;
		System.out.print("The AVERAGE of above marks is - "+b);



		

		
	}

}
