package bankapp;
import java.util.Scanner;
public class Solution1 {
public static void main(String[] args) {
	
	System.out.println("WELCOME TO CALCULATOR");
	System.out.println("===============");
	
	Scanner sc = new Scanner(System.in);
	Calculator cal=new Calculator();
	
	
	while(true){
    System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:Exit");
    System.out.println("Enter choice");
    int choice = sc.nextInt();
    
    
   System.out.println("Enter value of 1st number ::");
    int a = sc.nextInt();

    System.out.println("Enter value of 2nd number ::");
    int b = sc.nextInt();

    switch(choice) {
       case 1 :
          System.out.println("Sum of the given two numbers: ");
		  cal.Addition(a, b);
          break;
       case 2 :
          System.out.println("Difference between the two numbers: ");
          cal.Substraction(a, b);
          break;
       case 3 :
          System.out.println("Product of the two numbers: ");
          cal.Multiplication(a, b);
          break;
       case 4 :
          System.out.println("Result of the division: ");
          cal.Divison(a, b);
          break;
       case 5 :
           System.out.println("Thank you: ");
           System.exit(0);
           break;
       default :
           System.out.println("Invalid choice");
    }
    System.out.println("------------");
    
	}
 }
}

 

