import java.util.Scanner;

public class bobcar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double economy = 35;
		double compact = 45;
		double standard = 95;

		System.out.println("What car would you like to rent? 1 for economy, 2 for compact, 3 for standard.");
		int carType = input.nextInt();
		
		System.out.println("How many days would you like to rent the car?");
		int days = input.nextInt();
		
		System.out.println("Are you a member? Press 1 for yes and 2 for No.");
		int platPack = 0;
		int member = input.nextInt();
		
		
		if (member == 1) {
			System.out.println("Would you like the platinum package? Press 1 for yes and 0 for no.");
			platPack = input.nextInt();
		}
		double price = 0;

		if (carType == 1) {
			price = economy * days;
		} else if (carType == 2) {
			price = compact * days;
		} else if (carType == 3) {
			price = standard * days;
		}
		System.out.println("Your base total is " + price);
		if (member == 1) {
			int discountDays = days / 7;
			double discountPrice = 0;
			if (carType == 1) {
				discountPrice = (economy * discountDays);
			} else if (carType == 2) {
				discountPrice = (compact * discountDays);
			} else if (carType == 3) {
				discountPrice = (standard * discountDays);
			}

			
			System.out.println("Your membership discout is: " + discountPrice);

			if (platPack == 1) {
				double platPackPrice = .15 * price;

				
				System.out.println("Platinum Package .................... +" + platPackPrice);

				price += platPackPrice;
			}
			price -= discountPrice;
		}
		System.out.println("Your total price is: " + price);
		input.close();
	}

}
