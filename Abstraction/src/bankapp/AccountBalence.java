package bankapp;

public class AccountBalence {

	public static void main(String[] args) {
		ATM a=new ATM();//implimentation also visible
		
	a.checkBalence();
	
	System.out.println("----------");
		 	
	a.deposit(1200);
	a.checkBalence();
	System.out.println("----------");
	 
    a.withdraw(500);
    a.checkBalence();
    
    System.out.println("=================");
    
    Bank b=new ATM();//it will not show the implimentation
    
    b.checkBalence();
    System.out.println("----------");
    
     b.deposit(1200);
	 b.checkBalence();
	 System.out.println("----------");
	
	 b.withdraw(500);
	 b.checkBalence();

    
	}

}
