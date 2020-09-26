class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day, amount the debtor is to pay and assign values to them
   
	
	int amountPaidPerDay =1000;
	int amountPaid = 3000;
	int DefaultedDays = 4;
   
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
  int noOfdaysPaidfor ;
  int AmounttoPay;
  int daystoPayleft ;
  int amounttocomplete ;

   // calculate and print total amount the debtor is to pay
   AmounttoPay= DefaultedDays * amountPaidPerDay;
   System.out.println ("The amount to pay is " + AmounttoPay);

   // calculate and print the days the debtor paid for
  noOfdaysPaidfor = amountPaid/amountPaidPerDay;
  System.out.println("The number of days the debtor has paid for is " + noOfdaysPaidfor + " days");

  // calculate and print the amount whose day was not captured because the amount was incomplete
  int incompleteamount = amountPaid%amountPaidPerDay;
  System.out.println ("Incomplete amount day is " + incompleteamount +" days");

   // calculate and print amount the debtor is left to pay  
   amounttocomplete = AmounttoPay-amountPaid;
   System.out.println("Amount left to pay is " + amounttocomplete);

   // calculate and print days the debtor has not payed for
   daystoPayleft = DefaultedDays - noOfdaysPaidfor;
   System.out.println("The debtor has not paid for " + daystoPayleft +" day");

   //kindly remove the statement below when you are done with the assignment
  }
}