/** This program acts as a class so that the user can use methods 
* that is able to manipulate item information
* @author CS122 Kelangit Hakim
* @version 2.0 (12/14/2023)
* @see (include related class here) */

public class ShoppingItem 
{
   private String name;
   private int quantity;
   private double price;
   
   /** 
   * Constructs an item order to purchase the item with the 
   * given name, in the given quantity, which costs the given 
   * price per unit
   * @param String name for the name of the item
   * @param integer for the number of the item (cannot be in decimals)
   * @param double pricePerUnit price for each unit
   */
   public ShoppingItem (String name, int quantity, double pricePerUnit)
   {
      this.name = name;
      this.quantity = quantity;
      this.price = pricePerUnit;
   }
   
   /**
   * Method used is to get the name of the item, since it was initialized in the ShoppingItem class
   * This needs to be used to get the specific name of the item
   * @returns a String value 
   */
   public String getName()
   {
     return name;
   }
   
   /** 
   * This method is used to get the cost that the user needs to pay 
   * based on the number of item that is entered and the price of each item
   * @returns a double value to represent cost
   *   
   */
   public double getCost()
   {
      return quantity*price;
   }
   
   /** The method sets this grocery item’s quantity to be the given value
   * this initializes the quantity set by the user as the new quantity of the item.
   * @param integer variable; quantity.
   */
   public void setQuantity(int quantity) 
   {
      this.quantity = quantity;
   }
   
   /*
   * quantity and the shopping item name separated by
   * space. For example, the method will return “3 Eggs”
   * given the shopping item name is Eggs, and the quantity 
   * @returns a String value
   */
   
   public String toString() 
   {
      return quantity+" "+name+"\n";
   }
   
   /*
   * Sets the name of this object.
   * This method assigns the provided string to the name field of this object.
   * For example, if the name passed is "Anakin", this method will set the object's name to "Anakin".
   * @param name the String value to set as the name of this object
   */

   
   public void set_Name (String name)
   {
      this.name = name;
   }
   
   /*
   * Retrieves the quantity value of this object.
   * This method returns the current value of the quantity field of this object.
   * For instance, if the quantity is set to 5, this method will return 5.
   * @return the integer value representing the quantity of this object
   */
   
   public int getQuantity ()
   {
      return quantity;
   }
}  
