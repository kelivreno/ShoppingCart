/** Hangman methods using arraylist and other concepts
* @author CS122 Kelangit Hakim
* @version 1.0 (11/12/2023)
* @see (include related class here) */

public class ShoppingList 
{
   private ShoppingItem[] items;
   private int size;
   
   /**
   * Constructs a new ShoppingList object.
   * This constructor initializes a new ShoppingList with an array of ShoppingItem objects.
   * The initial capacity of the array is set to 10 items, and the initial size of the ShoppingList is set to 0,
   * indicating that it contains no items initially.
   *
   */
   public ShoppingList() 
   {
      items = new ShoppingItem[10];
      size = 0;
   }
   
   /**
   * Adds a new item to the shopping list.
   * This method adds a ShoppingItem object to the shopping list if there is space available.
   * The list can hold up to 10 items. If the list already contains 10 items, the method will not add
   * the new item and will return false. If the item is successfully added, the method returns true.
   * @param item the ShoppingItem object to be added to the shopping list
   * @return true if the item is successfully added; false if the shopping list is already full
   */
   
   public boolean add (ShoppingItem item)
   {
      if (size<10)
       {
         items[size] = item;
         size++;
         return true;
       } 
      else return false;
   }
   
   /**
   * Calculates the total cost of all items in the shopping list.
   * This method iterates through each item in the shopping list and sums up their costs.
   * The total cost is calculated based on the cost of each individual item in the list. If the list is empty,
   * the method returns 0.
   *
   * @return the double value representing the total cost of all items in the shopping list
   */
   public double getTotalCost () 
   {  
      double total_Cost = 0;
      // iterating value
      for(int i=0;i<size;i++)
      {
         total_Cost = total_Cost + items[i].getCost();
      }
         return total_Cost;
   }
   
      /**
      * Provides a string representation of the shopping list.
      * This method constructs a string that lists all the shopping items in the list along with their quantities.
      * The items are listed in the order they were added, and each item is represented by its quantity followed by its name.
      * The quantities and names are separated by "x" and the items are separated by commas. For example, a list with 3 eggs
      * and 2 apples would be represented as "3x Eggs, 2x Apples".
      * @return a String that represents the current state of the shopping list, including the number of items and their details
      */   
      public String toString() 
      {
      String Shopping_List = "Shopping_List has "+ size+ " shopping items: ";
      // iterating value
      
      // Concatenate the shopping list
      
      for(int i=0;i<size;i++)
      {
         if(i==size-1)
         {
         Shopping_List = Shopping_List + items[i].getQuantity()+"x "+items[i].getName();
         } else {
         Shopping_List = Shopping_List + items[i].getQuantity()+" "+items[i].getName()+", ";
         }
      }
         return Shopping_List;
      }
   
   /**
   * Searches for an item in the shopping list by its name.
   * This method iterates through the shopping list and compares each item's name with the provided itemName.
   * If an item with a matching name is found, that item is returned. If no matching item is found, the method returns null.
   * For example, if "Apples" is passed as itemName and there's an item with the name "Apples" in the list, that item will be returned.
   * @param itemName the name of the item to search for in the shopping list
   * @return the ShoppingItem with the specified name if it exists in the list; null otherwise
   */   
 
 public ShoppingItem searchByName(String itemName) 
   {
        for (int i = 0; i < size; i++) 
        {
            if (items[i].getName().equals(itemName)) 
            {
                return items[i];
            }
        }
        return null;
   }
}