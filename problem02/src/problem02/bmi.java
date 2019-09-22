package problem02;

import java.util.Scanner;

public class bmi {
	

	public final static double METER = .3048;

	public final static double KG = 2.2046;

	public final static int BMI = 703;

	public static void main(String[] args) {
		int option;

		do {
			System.out.print("\n\n\n1. Imperical System: ");
			System.out.print("\n2. Metric System: ");

			System.out.print("\nEnter choice: ");
			option = STDIN_SCANNER.nextInt();


			switch(option) {
			case 1:

				lbs();
				break;

			case 2:
				kg();
				break;

			default:
				System.out.print("\nInvalid choice");
			}
		} while(option != 3);
	}

	public static void lbs() {
		float height, weight, bmi, convert,inches,x,y;

		System.out.print("Enter feet: ");
		height = STDIN_SCANNER.nextFloat();

		System.out.print("Enter inches: ");
		inches = STDIN_SCANNER.nextFloat();

		System.out.print("Enter weight (lbs): ");
		weight = STDIN_SCANNER.nextFloat();

		y = inches * 1;
		convert = 12 * height; //Convert ft to inches
		x = y + convert;
		bmi = (BMI * weight) / (x * x);
		System.out.printf("BMI is %f", bmi);
		if(bmi < 18.5) {
			System.out.println("\nUnderweight");
		} else if(bmi >= 18.5 && bmi < 24.9) {
			System.out.println("\nNormal");
		} else if(bmi >= 25 && bmi < 29.9) {
			System.out.println("\nOverweight");
		} else {
			System.out.println("\nObesity");
		}
	}

	public static void kg() {
		float heightM, weightM, convertM, bmiM,meters,cmM;
		System.out.print("Enter meters: ");
		meters = STDIN_SCANNER.nextFloat();

		System.out.print("Enter weight (kg): ");
		weightM = STDIN_SCANNER.nextFloat();

		convertM = (float)(meters / 0.010000); // Convert ft to meter
		cmM = convertM / 100;


		bmiM = (weightM) / (cmM * cmM);

		System.out.printf("Your bmi is %f", bmiM);

		if(bmiM < 18.5) {
			System.out.println("\nUnderweight");
		} else if(bmiM >= 18.5 && bmiM < 24.9) {
			System.out.println("\nNormal");
		} else if(bmiM >= 25 && bmiM < 29.9) {
			System.out.println("\nOverweight");
		} else {
			System.out.println("\nObesity");
		}
	}



	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}