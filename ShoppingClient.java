/** Shopping client for the  
* @author CS122 Kelangit Hakim
* @version 2.0 (12/14/2023)
* @see (include related class here) */

import java.util.*;

public class ShoppingClient
{
   public static void main (String[] args)
   {  
      Scanner console = new Scanner (System.in); 
      System.out.println("Welcome to shopping cart application!");
      int option = readInput(console);  
      ShoppingList list = new ShoppingList();  
      do 
      {
        switch (option) 
        {
         /** 
         * Case 1: Display Options Menu.
         * When the user selects option 1, this case is executed.
         * It displays a menu with various options including:
         * 1. Display the current menu.
         * 2. Create a new shopping item.
         * 3. Change the quantity of an existing item.
         * 4. Display the current shopping list.
         * 5. Exit the program.
         * This provides a guide for the user to make further selections.
         */
         case 1: /** If option is equals to 1**/
            System.out.println("1. Display menu.");
            System.out.println("2. Create a shopping item.");
            System.out.println("3. Change the quantity of an item.");
            System.out.println("4. Display the shopping list.");
            System.out.println("5. Exit the program.");
            break;
         /** 
         * Case 2: Create a New Shopping Item.
         * When the user selects option 2, this case is executed.
         * It guides the user through the process of creating a new shopping item.
         * The user is prompted to enter the name, quantity, and price per unit of the item.
         * After these details are entered, a new ShoppingItem object is created and added to the shopping list.
         * A confirmation message with the item details is then displayed.
         */
         case 2: // If option is equals to 2
            System.out.println("2. Create a shopping item");
            // Code for creating a shopping item
            System.out.print("Enter the shopping item: ");
            String itemName = console.next();
            System.out.print("Enter the quantity: ");
            int quantity = console.nextInt();
            System.out.print("Enter the price: ");
            double pricePerUnit = console.nextDouble();
            ShoppingItem newItem = new ShoppingItem(itemName, quantity, pricePerUnit);
            System.out.println("New item created: " + newItem.toString());
            break;
         /** 
         * Case 3: Change the Quantity of an Item.
         * When the user selects option 3, this case is executed.
         * The user is prompted to enter the name of the item whose quantity needs to be changed, 
         * followed by the new quantity that is to be set for that item.
         * The method searches the shopping list for the item. If the item is found, its quantity is updated,
         * and a confirmation message is displayed. If the item is not found, an error message is displayed.
         */
         case 3: // If option is equals to 3
            System.out.println("3. Change the quantity of an item");
            System.out.print("Enter the name of the item: ");
            String itemToChange = console.next();
            System.out.print("Enter the new quantity: ");
            int newQuantity = console.nextInt();
            // Search for the item in the shopping list
            ShoppingItem item = list.searchByName(itemToChange);
            if (item != null) 
            {
               // If the item is found, update its quantity
               item.setQuantity(newQuantity);
               System.out.println("Quantity of " + item.getName() + " changed to " + item.getQuantity());
            } else 
            {
               // If the item is not found, display an error message
               System.out.println("Item not found in the shopping list.");
            }
            break;
         /** 
         * Case 4: Display the Shopping List.
         * When the user selects option 4, this case is executed.
         * This option is used to display the current state of the shopping list.
         * It invokes the toString() method of the shopping list object, 
         * which provides a formatted string representation of all the items in the list,
         * including their names, quantities, and prices.
         */   
         case 4: // If option is equals to 4
                System.out.println("4. Display the shopping list");
                System.out.println(list.toString());
                break;
                
         case 5: break; /** this will end the program*/
         default:
            System.out.println("Invalid");
            break;
        }
        option = readInput(console);   
      } while (option!=5);
      // When you are here, option == 5
      System.out.println("Bye!");
      
      
   }
   
   /**
   * Prompts the user to enter a number between 1 and 5 and reads the input.
   * This static method uses a Scanner object to read input from the user. It prompts the user to enter a choice from 1 to 5.
   * If the user enters a non-integer value, it repeatedly prompts the user to re-enter a valid number until an integer is entered.
   * Once a valid integer is entered, it is returned by the method.
   * @param console the Scanner object used to read input from the user
   * @return the integer value entered by the user, guaranteed to be a valid integer
   */
   
   public static int readInput (Scanner console)
   {
      System.out.print("Press your choice from 1 to 5: ");
      while(!console.hasNextInt())
      {
         System.out.print("Re-enter a number option: ");
         console.next();//discard the bad input
      }
      // When you are here, input is always a number
      return console.nextInt();
      
   }
}
