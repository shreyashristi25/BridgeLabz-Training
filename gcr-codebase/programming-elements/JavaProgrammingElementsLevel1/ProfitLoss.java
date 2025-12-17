//create a class ProfitLoss to calculate Profit and loss
public class ProfitLoss {

   public static void main (String args[]) {
      
	  //create variables and assign them given values
	  int costPrice = 129 ;
	  int sellingPrice = 191 ;
	  int profit = sellingPrice - costPrice ;
	  int loss = costPrice - sellingPrice ;
	  
	  //Displaying  cost price, selling price, profit and profit percentage  
	  System.out.println ("The Cost Price is INR " + costPrice + " " + "and Selling Price is INR "+ sellingPrice + "\n" +
      "The Profit is INR"+ " " + profit + " " + "and the Profit Percentage is" + " " + (double)(profit / costPrice) * 100 ) ;
	  
   }
  }