package org.bank;

public class SBIBank extends CommonBank
{
	public double Balance=0.0;
	public void Disp()
	{
	System.out.println("Your Current Balance in HDFC bank : "+Balance);
	}
	public void WithDraw(double Amount)
	{
		if(Amount<Balance)
		{
	      Balance=Balance-Amount;
	      Disp();
		}
		else if(Amount>Balance)
		{
		System.out.println("Your Current Balance is :"+Balance+" So You Can not able to withdraw:(");
		Disp();
		}
		else if(Amount==Balance)
		{
		System.out.println("Your Current Balance is :"+Balance+" You should not maintain Zero Balance So You Can not albe to withdraw:(");
		Disp();
		}
		else
		{
			System.out.println("Somthing went wrong Please try again");
		}			
	}
	public void Deposite(double DAmount)
	{
	Balance=DAmount+Balance;
	System.out.println("Your Amount was deposited ");
	Disp();
	System.out.println("Thank you Visit Again :)");
	}
}
