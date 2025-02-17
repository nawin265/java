import java.util.Scanner;

class NStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalCost = 0.0;
        int choice = 0;
        
        System.out.println("------------Welcome to NATIONAL MART--------------");
        
        while (choice != 5) {
            System.out.println("Please select an item category:");
            System.out.println("1. Electronics - $200 each");
            System.out.println("2. Groceries - $50 each");
            System.out.println("3. Clothing - $100 each");
            System.out.println("4. Home Appliances - $150 each");
            System.out.println("5. Exit and Show Total Cost");
            
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            
            int quantity = 0;
            switch (choice) {
                case 1:
                    System.out.print("You chose Electronics. Enter the quantity: ");
                    quantity = scanner.nextInt();
                    totalCost += 200.00 * quantity;
                    System.out.println("You added " + quantity + " Electronics item(s) to your cart.");
                    break;
                case 2:
                    System.out.print("You chose Groceries. Enter the quantity: ");
                    quantity = scanner.nextInt();
                    totalCost += 50.00 * quantity;
                    System.out.println("You added " + quantity + " Groceries item(s) to your cart.");
                    break;
                case 3:
                    System.out.print("You chose Clothing. Enter the quantity: ");
                    quantity = scanner.nextInt();
                    totalCost += 100.00 * quantity;
                    System.out.println("You added " + quantity + " Clothing item(s) to your cart.");
                    break;
                case 4:
                    System.out.print("You chose Home Appliances. Enter the quantity: ");
                    quantity = scanner.nextInt();
                    totalCost += 150.00 * quantity;
                    System.out.println("You added " + quantity + " Home Appliances item(s) to your cart.");
                    break;
                case 5:
                    System.out.println("Exiting the store...");
                    break;
                default:
                    System.out.println("Invalid choice, please select a valid option (1-5).");
                    continue;
            }
            
            if (choice != 5) {
                System.out.print("Would you like to add more items to your cart? (yes/no): ");
                String continueShopping = scanner.next();
                
                if (continueShopping.equalsIgnoreCase("no")) {
                    choice = 5;
                    System.out.println("Thank you for shopping with us! Goodbye.");
                }
            }
        }
        
        System.out.println("Your total cost: $" + totalCost);

        scanner.close();
    }
}
