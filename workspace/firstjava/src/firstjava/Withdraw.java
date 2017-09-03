package firstjava;

public class Withdraw {
public static void main (String[] args)
{
	int balance =10000;
	boolean withdraw;
	
	if (balance < 0)
	  withdraw = false;
	else 
		withdraw = true;
	System.out.println("can i withdraw:" + withdraw);
	
	
}
}
