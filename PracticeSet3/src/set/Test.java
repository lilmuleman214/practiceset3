package set;

public class Test {
	
	public static void main(String[] args){
		Account test1 = new Account(1122, 20000);
		test1.setAnnualInterestRate(4.5);
		test1.deposit(3000);
		
		try
	      {
	         test1.withdraw(2500);
	         System.out.println("Balance: " + test1.getBalance());
	 		 System.out.println("Monthly rate: " +test1.getMonthlyInterestRate());
	 		 System.out.println("Date created: " + test1.getDateCreated());
	 		
	 		 test1.withdraw(300000);
	         
	      }catch(InsufficientFundsException e)
	      {
	         System.out.println("Sorry, but you are short $"
	                                  + e.getAmount());
	         e.printStackTrace();
	      }
		
	}
}
