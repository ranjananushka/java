import java.util.Scanner;

public class restuarant {

	public static void main(String[] args) {
		System.out.println("Welcome to the Coffee Shop");
		Scanner sc= new Scanner(System.in);
		int total=0;
		System.out.println("Menu list \n  1->Cold Coffee(Rs25) \n 2->Tea(Rs10)" +
				" \n 3->Hot Coffee (Rs 30)");
		System.out.println("select your item");
		int b=sc.nextInt();
		int price = 0;
	    while(b==1||b==2||b==3)
	    {	
	    	System.out.println("Quantity needed?");
	    	int quantity=sc.nextInt();
	    	switch(b)
	    	{
	    		case 1:
	    			price=25;
	    			break;
	    		case 2:
	    			price=10;
	    			break;
	    		case 3:
	    			price=30;
	    			break;
	    		default:
	    			System.out.print("you have not selected any item");
	    	}
			total += quantity * price;
	    	System.out.println("do you want anything else");
	    	String c=sc.next();
	    	System.out.println(c.toUpperCase());
	    	if (c.toUpperCase().equals("Y")){
				System.out.println("select your item");
				b=sc.nextInt();

			}
			else{
				System.out.println("thankyou for shopping with us");
				break;
				}
	    	}
	    System.out.println("your total amount  is "+total);
	    System.out.println("Your total amount including tax is"+((total*0.145)+total));
	}	
}
