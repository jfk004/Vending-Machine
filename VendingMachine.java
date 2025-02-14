import java.util.Scanner;


public class VendingMachine {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		boolean userDone = false;

		boolean insertAmount = false;

		String snackName = "";

		double total = 0.0;

		double userMoney = 0.0;

		double priceSnickers = 1.29d;
		double priceSourPatchKids = 1.89d;
		double priceLaysOriginal = 0.89d;
		double priceDoritos = 0.89d;
		double priceCookies = 2.59d;
		double priceStrawberryPoptart = 4.19d;
		double priceGranolaBar = 2.99d;
		double priceChexMix = 8.19d;
		double priceBeefJerky = 9.29d;
		double priceSwedishFish = 0.55d;

		System.out.println("Welcome! Please type in what you want to buy.");
		System.out.println(String.format("Our options are:\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n %s: $%f\n", 
		"Snickers", priceSnickers, "Sour Patch Kids", priceSourPatchKids, "Lays Original", priceLaysOriginal, "Doritos", priceDoritos, 
		"Cookies", priceCookies, "Strawberry Poptarts", priceStrawberryPoptart, "Granola Bar", priceGranolaBar, "Chex Mix", priceChexMix, "Beef Jerky", priceBeefJerky, 
		"Swedish Fish", priceSwedishFish));

		


		while (!userDone) {
			System.out.println("Which snack would you like to buy?");
			snackName = userInput.nextLine().toUpperCase();
			switch(snackName) {
				case "SNICKERS":
					System.out.println("You have chosen Snickers.");
					userDone = true;
					total = priceSnickers;
					break;

				case "SOUR PATCH KIDS":
					System.out.println("You have chosen Sour Patch Kids.");
					userDone = true;
					total = priceSourPatchKids;
					break;

				case "LAYS ORIGINAL":
					System.out.println("You have chosen Lays Original.");
					userDone = true;
					total = priceLaysOriginal;
					break;

				case "DORITOS":
					System.out.println("You have chosen Doritos.");
					userDone = true;
					total = priceDoritos;
					break;

				case "COOKIES":
					System.out.println("You have chosen Cookies.");
					userDone = true;
					total = priceCookies;
					break;

				case "STRAWBERRY POPTART":
					System.out.println("You have chosen Strawberry Poptart.");
					userDone = true;
					total = priceStrawberryPoptart;
					break;

				case "GRANOLA BAR":
					System.out.println("You have chosen Granola Bar.");
					userDone = true;
					total = priceGranolaBar;
					break;

				case "CHEX MIX":
					System.out.println("You have chosen Chex Mix.");
					userDone = true;
					total = priceChexMix;
					break;

				case "BEEF JERKY":
					System.out.println("You have chosen Beef Jerky.");
					userDone = true;
					total = priceBeefJerky;
					break;

				case "SWEDISH FISH":
					System.out.println("You have chosen Swedish Fish.");
					userDone = true;
					total = priceSwedishFish;
					break;

				default:
					
			}

			// Accepts money from the user 
			System.out.println( snackName  +  "is " +  total);
		while(!insertAmount){
			System.out.println("Insert amount('confrim')");

			String input = userInput.nextLine();
			if(input.equalsIgnoreCase("Confirm")){ //Press or type  confirm when the user is done inserting amount
				break;
			
			}try{
				int amount = Integer.parseInt(input);
				if(amount > 0 && amount%1 == 0 ){
					userMoney +=amount;
					System.out.println("Current balance: $" + userMoney);
				} else {
					System.out.println("Only $1 bills are accepted.");
				}
			}catch (NumberFormatException e){
				System.out.println("Invalid input. Please insert only $1 bills.");
			}
		

		}

			//Confirms the purchase 
			System.out.println("Confirm purchase?(Yes/No):");
			String confirm = userInput.nextLine();

			if(confirm.equalsIgnoreCase("no")){
				System.out.println("Transaction canceled. Amount refunded: $" + userMoney);
			} else if(userMoney >= total){
				
			    userMoney -= total;
				System.out.println("Thank you for your purchase! " + snackName + ".");

				if(userMoney > 0){
					System.out.println("Your balance is: $" + userMoney);
				} else {
					System.out.println("Insufficient funds. Transaction canceled. Amount refunded: $" + userMoney);
				}

			}

		}
		userInput.close();
		System.out.println("Enjoy your snack! Have a great day!!!");
		//System.out.println("Your total is: $" + total);
	}
}