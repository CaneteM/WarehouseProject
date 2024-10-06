package almacenes_exfeb23;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Creating a scanner to read user input
        Scanner input = new Scanner(System.in);

        // Arrays to store providers and articles
        Provider[] providersArray = new Provider[2];
        Article[] articlesArray = new Article[2];

        // Creating some initial providers and articles
        Provider provider1 = new Provider("0001l", "Jose", "Siempre vivo 33", "12/01/2022", "232313", "j@hotmail.com");
        Article article1 = new Article("1230ee", "Pomada", "Liquid article", 100, 10, 1, provider1);

        Provider provider2 = new Provider("00012", "Miguel", "Calle Alegria 33", "12/01/2022", "232313", "M@hotmail.com");
        Article article2 = new Article(null, null, null, 0, 0, 0, null);

        // Storing the providers and articles into arrays
        providersArray[0] = provider1;
        providersArray[1] = provider2;
        articlesArray[0] = article1;
        articlesArray[1] = article2;

        // Displaying the menu options
        System.out.println("1. Add Article \n" + 
                           "2. Remove Article \n" + 
                           "3. Add Provider \n" + 
                           "4. Remove Provider \n" + 
                           "5. List Articles \n" + 
                           "6. List Providers \n" + 
                           "7. Sell Article \n" + 
                           "8. Available Stock \n" + 
                           "9. Exit \n");

        int option;
        do {
            // Asking for an option from the user
            System.out.println("Select an option");
            option = Integer.parseInt(input.next());

            switch (option) {
                case 1:
                    System.out.println("Adding article1 to provider1");
                    provider1.addArticle(article1);
                    break;
                case 2:
                    System.out.println("Enter the article code to remove:");
                    String articleCode = input.next();
                    provider1.removeArticle(articleCode);
                    break;
                case 3:
                    System.out.println("Adding provider1");
                    article1.addProvider(provider1);
                    break;
                case 4:
                    System.out.println("Enter the provider code to remove:");
                    String providerCode = input.next();
                    article1.removeProvider(providerCode);
                    break;
                case 5:
                    // Listing all articles
                    for (int i = 0; i < 2; i++) {
                        System.out.println(articlesArray[i]);
                    }
                    break;
                case 6:
                    // Listing all providers
                    for (int i = 0; i < 2; i++) {
                        System.out.println(providersArray[i]);
                    }
                    break;
                case 7:
                    System.out.println("Selling article");
                    // Add selling functionality if needed
                    break;
                case 8:
                    // Displaying available stock for article1
                    System.out.println(article1.getStock());
                    break;
                case 9:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 9);

        // Checking if the provider exists for article2
        System.out.println(article1.isProviderAvailable(option, article2));
    }
}

