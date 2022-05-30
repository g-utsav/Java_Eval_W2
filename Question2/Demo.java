package Question2;

import java.util.Scanner;

public class Demo {
	
	static Student setDetails(Scanner sc) {
		System.out.println("Enter the Roll ( int ) : ");
		int roll = sc.nextInt();
		System.out.println("Enter the name ( String ) :  ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Enter the Address ( String ) : ");
		String addr = sc.nextLine();
		System.out.println("Enter the Marks ( int ) : ");
		int marks = sc.nextInt();
		System.out.println("*********************************************************");
		System.out.println();
		
		return new Student(roll, name, addr, marks);
	}
	
	static void printDetails(Student s, int i) {
		System.out.println("Details of Student "+i);
		System.out.println("Roll of the Student "+s.getRoll());
		System.out.println("Name of the Student "+s.getName());
		System.out.println("Address of the student "+s.getAddress());
		System.out.println("Marks of the Student "+s.getMarks());
		System.out.println("*********************************************************");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of Student Object you Need to create ( int ) : " );
		int n = sc.nextInt();
		
		Student[] student = new Student[n];
		
		for(int i=0; i<n; i++) {
			student[i] = Demo.setDetails(sc);
		}
		for(int i=0; i<n; i++) {
			Demo.printDetails(student[i], i);
		}

	}

}
