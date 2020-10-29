import java.util.Arrays;
import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numSamples;
		
		
		System.out.println("Please enter sample size:");
		numSamples = input.nextInt();
		
		int [][] array = new int[4][numSamples];
		
		
		for (int trial = 0; trial < array.length; trial++) {
			System.out.println("Please Enter numbers for trial " + trial);
			
			for(int s = 0; s < array[trial].length;s++) {
				
				System.out.println("Enter sample #" + s + ":");
				array[trial][s] = input.nextInt();
			}
		}
		
		//System.out.println(Arrays.deepToString(array));
		System.out.println("\tSample #\tTrial 1 \tTrial 2 \tTrial 3 \tTrial 4"); // Table header line
		for (int i = 0; i<numSamples ; i++) {
			System.out.print("\t" + i);
			for (int j = 0; j < array.length; j++) {
				System.out.print("\t\t" + array[j][i]);
			}
			System.out.println();
		}
		System.out.print("\t------------------------------------------------------------------------------------------------------------\nAverage\t\t\t");

		int[] avg = new int[array.length];
		for(int trial = 0; trial < array.length; trial++) {
			
			avg[trial] = 0;
			for(int sample=0; sample <numSamples; sample++) {
				avg[trial] += array[trial][sample];
			}
			avg[trial] /= numSamples;
			System.out.print(avg[trial]+ "\t\t");
		}
		
		int minAvg = avg[0], maxAvg = avg[0];
		for(int i = 0; i < avg.length; i ++) {
			if(avg[i] < minAvg)
				minAvg = avg[i];
			if(avg[i] > maxAvg)
				maxAvg=avg[i];
		}
		System.out.println("\nMin Average: " + minAvg);
		System.out.println("Max Average: " + maxAvg);
		
		if (minAvg == maxAvg)
			System.out.println("The trials match EXACTLY!");
		else if (maxAvg < (2*minAvg))
			System.out.println("The trials concur with each other!");
		else 
			System.out.print("The trials do NOT concur!");
		input.close();
	}

}
