package Constructors1;

public class Clock
{
	int hours;
	int minutes;
	int seconds;
	int  emin;
	Clock()
	{
      this.hours=10;
      this.minutes=50;
      this.seconds=30;
	}
  Clock(int hours,int minutes,int seconds)
{
	  this.hours=hours;
      this.minutes=minutes;
      this.seconds=seconds;
}
  Clock(int emin)
  {
	  this.emin=emin;
  }
  public void display()
  
  {
	  System.out.println("hours:"+hours);
  }

	public static void main(String[] args) 
	{
		Clock c=new Clock();
		Clock c1=new Clock(3,34,56);
		Clock c2=new Clock(43);
		c.display();
		c1.display();
		c2.display();
	}

}
