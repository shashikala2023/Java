package decision_making;

public class Sw1 {

	public static void main(String[] args) {
		int x=8;
		/*if(x==1) {System.out.println("The vlaue of x is 1");}
		else if (x==2){System.out.println("the value of x is 2");}
		else if (x==3) {System.out.println("the value of x is 3");	}
		else {System.out.println("the value of x is other than 1,2,3");}
	*/
		switch (x)
		{
		case 1:
			System.out.println("the value of x is 1");
		
		break;
		
		case 2:
			System.out.println("the value of x is 2");
			break;
		case 3:
			System.out.println("the value of x is 3");
		default:
			System.out.println("The value of x is other 1,2,3");
		break;	
		}
	
	}
}
