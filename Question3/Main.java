package Question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of passengers");
		int num = sc.nextInt();
		System.out.println("Enter number of kms");
		int km = sc.nextInt();
		
		OLA ola = new OLA();
		Car car = ola.bookCar(num, km);
		
		int bill = ola.calculateBill(car);
		
		System.out.println("The total fare amount is "+ bill);
	}

}
