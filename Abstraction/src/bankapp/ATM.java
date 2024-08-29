package bankapp;

public class ATM implements Bank {
	
	int balence=10000;
	  @Override
	  public void deposit(int amount) 
	  {
		 System.out.println("I am depositing amount");
		 balence = balence+ amount;
		 System.out.println("Amount deposited successfully");
	   }
	   @Override
	   public void withdraw(int amount) 
	   {
		   System.out.println("I am withdrawng amount");
		   balence = balence- amount;
		   System.out.println("Amount withdrawed successfully");
		}
	   @Override
	    public void checkBalence( ) 
	   {
		  
		   System.out.println("Available balence is "+balence);
		}
}
