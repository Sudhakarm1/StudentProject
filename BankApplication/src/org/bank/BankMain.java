package org.bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Choose your bank");
		System.out.println("1.HDFC");
		System.out.println("2.SBI");
		System.out.println("3.ICICI");
	    int Bank=Sc.nextInt();
	    switch(Bank)
	    {
	    case 1:
	    	   HDFCBank Bank1=new HDFCBank();
	    	   System.out.println("WELCOME TO HDFC BANK");
	    	   System.out.println("PLEASE CHOOSE YOUR OPTION");
	   		   System.out.println("1.Balance Enquerie");
	   		   System.out.println("2.withdrow Amount");
	   		   System.out.println("3.Deposite Amount");
	   		   int HDFCBank=Sc.nextInt();
	   		   switch(HDFCBank)
	   		   {
	   		   case 1:
	   			   Bank1.Disp();
	   			   System.out.println("PLEASE CHOOSE YOUR OPTION");
		   		   System.out.println("1.withdrow Amount");
		   		   System.out.println("2.Deposite Amount");
		   		   System.out.println("3.Want to Exit");
		   		   int HDFCBank1=Sc.nextInt();
		   		   switch(HDFCBank1)
		   		   {
		   		   case 1:
		   			   System.out.println("Please Enter WithDraw Amount");
		   			   double Amount=Sc.nextDouble();
		   			   Bank1.WithDraw(Amount);
		   			   break;
		   		   case 2:
		   			   System.out.println("Please Enter Deposite Amount");
		   			   double DAmount=Sc.nextDouble();
		   			   Bank1.Deposite(DAmount);
		   			   break;
		   		   case 3:
		   			   System.out.println("Thank you visit Again");
		   			   break;
		   			default:
		   				  System.out.println("Please Enter valid Data");   
		   		   }
	   			   break;
	   		   case 2:
	   			   System.out.println("Please Enter WithDraw Amount");
	   			   double Amount=Sc.nextDouble();
	   			   Bank1.WithDraw(Amount);
	   			   System.out.println("PLEASE CHOOSE YOUR OPTION");
		   		   System.out.println("1.Balance Enquires");
		   		   System.out.println("2.Deposite Amount");
		   		   System.out.println("3.Want to Exit");
		   		   int HDFCBank2=Sc.nextInt();
		   		   switch(HDFCBank2)
		   		   {
		   		   case 1:
		   			   Bank1.Disp();
		   			   break;
		   		   case 2:
		   			   System.out.println("Please Enter Deposite Amount");
		   			   double DAmount=Sc.nextDouble();
		   			   Bank1.Deposite(DAmount);
		   			   break;
		   		   case 3:
		   			   System.out.println("Thank you visit Again");
		   			   break;
		   			default:
		   				  System.out.println("Please Enter valid Data");   
		   		   }
	   			   break;
	   		   case 3:
	   			   System.out.println("Please Enter Deposite Amount");
	   			   double DAmount=Sc.nextDouble();
	   			   Bank1.Deposite(DAmount);
	   			   System.out.println("PLEASE CHOOSE YOUR OPTION");
		   		   System.out.println("1.withdrow Amount");
		   		   System.out.println("2.Balance Enquries");
		   		   System.out.println("3.Want to Exit");
		   		   int HDFCBank3=Sc.nextInt();
		   		   switch(HDFCBank3)
		   		   {
		   		   case 1:
		   			   System.out.println("Please Enter WithDraw Amount");
		   			   Amount=Sc.nextDouble();
		   			   Bank1.WithDraw(Amount);
		   			   break;
		   		   case 2:
		   			   Bank1.Disp();
		   			   break;
		   		   case 3:
		   			   System.out.println("Thank you visit Again");
		   			   break;
		   			default:
		   				  System.out.println("Please Enter valid Data");   
		   		   }
	   			   break;
	   		   default:
	   			   System.out.println("Please Enter valid Data");
	   			   break;
	   		   }
	    	   
	    	   break;
	    case 2:
	    	   SBIBank Bank2=new SBIBank();
	    	   System.out.println("WELCOME TO SBI BANK");
	    	   System.out.println("PLEASE CHOOSE YOUR OPTION");
	   		   System.out.println("1.Balance Enquerie");
	   		   System.out.println("2.withdrow Amount");
	   		   System.out.println("3.Deposite Amount");
	   		   int SBIBank=Sc.nextInt();
	   		   switch(SBIBank)
	   		   {
	   		   case 1:
	   			   Bank2.Disp();
	   			   System.out.println("PLEASE CHOOSE YOUR OPTION");
		   		   System.out.println("1.withdrow Amount");
		   		   System.out.println("2.Deposite Amount");
		   		   System.out.println("3.Want to Exit");
		   		   int SBIBank1=Sc.nextInt();
		   		   switch(SBIBank1)
		   		   {
		   		   case 1:
		   			   System.out.println("Please Enter WithDraw Amount");
		   			   double Amount=Sc.nextDouble();
		   			   Bank2.WithDraw(Amount);
		   			   break;
		   		   case 2:
		   			   System.out.println("Please Enter Deposite Amount");
		   			   double DAmount=Sc.nextDouble();
		   			   Bank2.Deposite(DAmount);
		   			   break;
		   		   case 3:
		   			   System.out.println("Thank you visit Again");
		   			   break;
		   			default:
		   				  System.out.println("Please Enter valid Data");   
		   		   }
	   			   break;
	   		   case 2:
	   			   System.out.println("Please Enter WithDraw Amount");
	   			   double Amount=Sc.nextDouble();
	   			   Bank2.WithDraw(Amount);
	   		       System.out.println("PLEASE CHOOSE YOUR OPTION");
		   		   System.out.println("1.Balance Enquires");
		   		   System.out.println("2.Deposite Amount");
		   		   System.out.println("3.Want to Exit");
		   		   int SBIBank2=Sc.nextInt();
		   		   switch(SBIBank2)
		   		   {
		   		   case 1:
		   			   Bank2.Disp();
		   			   break;
		   		   case 2:
		   			   System.out.println("Please Enter Deposite Amount");
		   			   double DAmount=Sc.nextDouble();
		   			   Bank2.Deposite(DAmount);
		   			   break;
		   		   case 3:
		   			   System.out.println("Thank you visit Again");
		   			   break;
		   			default:
		   				  System.out.println("Please Enter valid Data");   
		   		   }
	   			   break;
	   		   case 3:
	   			   System.out.println("Please Enter Deposite Amount");
	   			   double DAmount=Sc.nextDouble();
	   			   Bank2.Deposite(DAmount);
	   			   System.out.println("PLEASE CHOOSE YOUR OPTION");
		   		   System.out.println("1.withdrow Amount");
		   		   System.out.println("2.Balance Enquries");
		   		   System.out.println("3.Want to Exit");
		   		   int SBIBank3=Sc.nextInt();
		   		   switch(SBIBank3)
		   		   {
		   		   case 1:
		   			   System.out.println("Please Enter WithDraw Amount");
		   			   Amount=Sc.nextDouble();
		   			   Bank2.WithDraw(Amount);
		   			   break;
		   		   case 2:
		   			   Bank2.Disp();
		   			   break;
		   		   case 3:
		   			   System.out.println("Thank you visit Again");
		   			   break;
		   			default:
		   				  System.out.println("Please Enter valid Data");   
		   		   }
	   			   break;
	   		   default:
	   			   System.out.println("Please Enter valid Data");
	   			   break;
	   		   }
	    	   break;
	    case 3:
	    	   ICICIBAnk Bank3=new ICICIBAnk();
	    	   System.out.println("WELCOME TO ICICI BANK");
	    	   System.out.println("PLEASE CHOOSE YOUR OPTION");
	   		   System.out.println("1.Balance Enquerie");
	   		   System.out.println("2.withdrow Amount");
	   		   System.out.println("3.Deposite Amount");
	   		   int ICICIBank=Sc.nextInt();
	   		   switch(ICICIBank)
	   		   {
	   		   case 1:
	   			   Bank3.Disp();
	   			   System.out.println("PLEASE CHOOSE YOUR OPTION");
		   		   System.out.println("1.withdrow Amount");
		   		   System.out.println("2.Deposite Amount");
		   		   System.out.println("3.Want to Exit");
		   		   int ICICIBank1=Sc.nextInt();
		   		   switch(ICICIBank1)
		   		   {
		   		   case 1:
		   			   System.out.println("Please Enter WithDraw Amount");
		   			   double Amount=Sc.nextDouble();
		   			   Bank3.WithDraw(Amount);
		   			   break;
		   		   case 2:
		   			   System.out.println("Please Enter Deposite Amount");
		   			   double DAmount=Sc.nextDouble();
		   			   Bank3.Deposite(DAmount);
		   			   break;
		   		   case 3:
		   			   System.out.println("Thank you visit Again");
		   			   break;
		   			default:
		   				  System.out.println("Please Enter valid Data");   
		   		   }
	   			   break;
	   		   case 2:
	   			   System.out.println("Please Enter WithDraw Amount");
	   			   double Amount=Sc.nextDouble();
	   			   Bank3.WithDraw(Amount);
	   			   System.out.println("PLEASE CHOOSE YOUR OPTION");
		   		   System.out.println("1.Balance Enquires");
		   		   System.out.println("2.Deposite Amount");
		   		   System.out.println("3.Want to Exit");
		   		   int ICICIBank2=Sc.nextInt();
		   		   switch(ICICIBank2)
		   		   {
		   		   case 1:
		   			   Bank3.Disp();
		   			   break;
		   		   case 2:
		   			   System.out.println("Please Enter Deposite Amount");
		   			   double DAmount=Sc.nextDouble();
		   			   Bank3.Deposite(DAmount);
		   			   break;
		   		   case 3:
		   			   System.out.println("Thank you visit Again");
		   			   break;
		   			default:
		   				  System.out.println("Please Enter valid Data");   
		   		   }
	   			   break;
	   		   case 3:
	   			   System.out.println("Please Enter Deposite Amount");
	   			   double DAmount=Sc.nextDouble();
	   			   Bank3.Deposite(DAmount);
	   			   System.out.println("PLEASE CHOOSE YOUR OPTION");
		   		   System.out.println("1.withdrow Amount");
		   		   System.out.println("2.Balance Enquries");
		   		   System.out.println("3.Want to Exit");
		   		   int ICICIBank3=Sc.nextInt();
		   		   switch(ICICIBank3)
		   		   {
		   		   case 1:
		   			   System.out.println("Please Enter WithDraw Amount");
		   			   Amount=Sc.nextDouble();
		   			   Bank3.WithDraw(Amount);
		   			   break;
		   		   case 2:
		   			   Bank3.Disp();
		   			   break;
		   		   case 3:
		   			   System.out.println("Thank you visit Again");
		   			   break;
		   			default:
		   				  System.out.println("Please Enter valid Data");   
		   		   }
	   			   break;
	   		   default:
	   			   System.out.println("Please Enter valid Data");
	   			   break;
	   		   }
	    	   break;
	    default :
	    	System.out.println("Invalid Data Please Enter valid Data");
	    	Bank=Sc.nextInt();
	    }
	}
}