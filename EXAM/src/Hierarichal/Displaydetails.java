package Hierarichal;
class Bank
{
	String bankname;
	public void Bank(String bankname)
	{
		this.bankname=bankname;
	}
	void showBankInfo()
	{
		System.out.println("Bank name:"+bankname);
	}	
}
class Account extends Bank
{
	int id;
	String Accountholder;
	double balance;
	public void Account(int id,String Accountholder,double balance)
	{
		this.id=id;
		this.Accountholder=Accountholder;
		this.balance=balance;
	}
	public void displayAccountInfo()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+Accountholder);
		System.out.println("balance"+balance);
	}
}
class currentAccount extends Account
{
   int interest;
   public void currentAccount(int interest)
   {
	   this.interest=interest;
	   
   }
   void displayInterestRate()
   {
	   System.out.println("Interest:"+interest);
	   }
   }
public class Displaydetails {

	public static void main(String[] args)
	{
		currentAccount s=new currentAccount("Hdfc",101,"Deepu",8000);
		s.showBankInfo();
		s.displayAccountInfo();
		s.displayInterestRate();
		

	}

}
