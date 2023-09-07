package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		Double n1 =  in.nextDouble();
		System.out.println("Enter the second number");
		Double n2 =  in.nextDouble();
		double avg = ((n1 + n2) / 2);
		System.out.println(avg);
	}

}
