package Stringbuffer;

public class EnsureCapacity {

	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("Helloo");
		System.out.println(s.capacity());
		s.ensureCapacity(22);
		System.out.println(s.capacity());
		s.ensureCapacity(22);
		System.out.println(s.capacity());	

	}

}
