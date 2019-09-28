package p003;

import java.util.Scanner;

public class polling {

	public static void main(String[] args) {
		// create a Scanner object to read user input
		Scanner in = new Scanner(System.in);

		String[] topics = new String[5];
		
		// add the topics to the array
		topics[0] = "Assassins Creed: Odyssey";
		topics[1] = "Depletion of Ozone";
		topics[2] = "Metro Exodus";
		topics[3] = "Melting Polar Caps";
		topics[4] = "The Witcher 3: Wild Hunt";

		// define a 2D array to store the responses
		int[][] responses = new int[5][10];
		
		// read the user responses
		System.out.println("Please rate each topic between 1(least important) and 10 (most important)");
		for (int person = 0; person < 10; person++) {
			for (int topic = 0; topic < 5; topic++) {
				System.out.print(">>> " + topics[topic] + ": ");
				responses[topic][person] = in.nextInt();
			}
			// leave a line space after 1 persons response for each topic is recorded
			System.out.println();
		}

		String maxPointIssue = "";
		String minPointIssue = "";

		double maxPoints = Double.MIN_VALUE;
		double minPoints = Double.MAX_VALUE;
		
		// display the data in a tabular form
		for (int topic = 0; topic < 5; topic++) {
			// display the topic first
			System.out.printf("%-30s", topics[topic]);
			double sum = 0;
			for (int person = 0; person < 10; person++) {
				sum += responses[topic][person];
				// display each response for that topic
				System.out.printf("%3d", responses[topic][person]);
			}
			
			// compute average
			double average = sum / 10;
			
			// update the max and min poins for topics
			if (average > maxPoints) {
				maxPoints = average;
				maxPointIssue = topics[topic];
			}

			if (average < minPoints) {
				minPoints = average;
				minPointIssue = topics[topic];
			}
			
			// display the average
			System.out.printf("%10.2f\n", average);
		}
		
		// display the issues with the max and the min points
		System.out.println("\nThe issue with Highest points: " + maxPointIssue + ", Points: " + maxPoints);
		System.out.println("\nThe issue with Lowest points: " + minPointIssue + ", Points: " + minPoints);
		in.close();

	}

}


