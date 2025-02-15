import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		boolean userDone = false;

		boolean insertedMoney = false;

		String snackName = "";

		double total = 0.0d;

		double userMoney = 0.0d;

		double priceSwedishFish = 0.55d;
		double priceLaysOriginal = 0.89d;
		double priceDoritos = 0.89d;
		double priceSnickers = 1.29d;
		double priceSourPatchKids = 1.89d;
		double priceCookies = 2.59d;
		double priceGranolaBar = 2.99d;
		double priceStrawberryPoptart = 4.19d;
		double priceChexMix = 8.19d;
		double priceBeefJerky = 9.29d;

		System.out.println("Welcome! Please type in what you want to buy.");

		System.out.println(String.format("Our options are:\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n", 
		"Swedish Fish", priceSwedishFish, "Lays Original", priceLaysOriginal, "Doritos", priceDoritos, "Snickers", priceSnickers, "Sour Patch Kids", priceSourPatchKids,
		"Cookies", priceCookies, "Granola Bar", priceGranolaBar, "Strawberry Poptart", priceStrawberryPoptart, "Chex Mix", priceChexMix, "Beef Jerky", priceBeefJerky));

		while (!userDone) {
			System.out.println("Please print the name of the snack you wish to purchase.");
			snackName = userInput.nextLine().toUpperCase();
			switch(snackName) {
				case "SNICKERS":
					total = priceSnickers;	
					System.out.println("You have chosen Snickers, it is $" + total + ".");
					userDone = true;
					break;

				case "SOUR PATCH KIDS":
					total = priceSourPatchKids;
					System.out.println("You have chosen Sour Patch Kids, it is $" + total + ".");
					userDone = true;
					break;

				case "LAYS ORIGINAL":
					total = priceLaysOriginal;
					System.out.println("You have chosen Lays Original, it is $" + total + ".");
					userDone = true;
					break;

				case "DORITOS":
					total = priceDoritos;
					System.out.println("You have chosen Doritos, it is $" + total + ".");
					userDone = true;
					break;

				case "COOKIES":
					total = priceCookies;
					System.out.println("You have chosen Cookies, it is $" + total + ".");
					userDone = true;
					break;

				case "STRAWBERRY POPTART":
					total = priceStrawberryPoptart;
					System.out.println("You have chosen Strawberry Poptart, it is $" + total + ".");
					userDone = true;
					break;

				case "GRANOLA BAR":
					total = priceGranolaBar;
					System.out.println("You have chosen Granola Bar, it is $" + total + ".");
					userDone = true;
					break;

				case "CHEX MIX":
					total = priceChexMix;	
					System.out.println("You have chosen Chex Mix, it is $" + total + ".");
					userDone = true;
					break;

				case "BEEF JERKY":
					total = priceBeefJerky;
					System.out.println("You have chosen Beef Jerky, it is $" + total + ".");
					userDone = true;
					break;

				case "SWEDISH FISH":
					total = priceSwedishFish;
					System.out.println("You have chosen Swedish Fish, it is $" + total + ".");
					userDone = true;
					break;

				default:
					System.out.println("Please type the name of a snack we have in stock.");
					snackName = userInput.nextLine().toUpperCase();
			}

			// Accepts money from the user 
			
			System.out.println("Please insert $1 bills by typing 1.\nYou can put as much money as you wish.");

			System.out.println("When you're done inserting cash, please type confirm.");
		
		while (!insertedMoney) {

			String input = userInput.nextLine();

			if(input.equalsIgnoreCase("Confirm")){ // Type confirm when the user is done inserting amount
				
				break;
			
			} try {
				int amount = Integer.parseInt(input);
				if (amount == 1) {
					userMoney += 1;
					System.out.println("Your total is: $" + total);
					System.out.println("Current balance: $" + userMoney);
				
					if (userMoney > total) {
						System.out.println("You have sufficient funds now. Please type confirm to continue.");
					}
				} else {
					System.out.println("Only $1 bills are accepted.");
				}

			} catch (NumberFormatException e){
				System.out.println("Invalid input. Please insert only $1 bills.");
			}
	
		}

			// Confirms the purchase 
			System.out.println("Confirm purchase? (Yes/No):");
			String confirm = userInput.nextLine();

			if(confirm.equalsIgnoreCase("no")){
				System.out.println("Transaction cancelled. Amount refunded: $" + userMoney);
				insertedMoney = true;
				System.out.println("Have a great day!");

			} else if (confirm.equalsIgnoreCase("yes")){
				
				if(userMoney > total) {
					userMoney -= total;
					System.out.println("Thank you for your purchase of " + snackName + ".");

					if (userMoney > 0) {
						System.out.println("Your change is: $" + userMoney);
					}

					System.out.println("Enjoy your yummy snack! Have a great day!!!");	

				} else {
					System.out.println("Insufficient funds. Transaction canceled. Amount refunded: $" + userMoney);
				}
			}
		}
		userInput.close();
	}
}