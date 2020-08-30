public class boxunbox
{
	public static void main(String[] args)
	{
		int n=10;
		Integer obj=Integer.valueOf(n);		//boxing 1.4 version
		Integer obj=n;						//autoboxing jdk1.5 or above
		int y=obj.intValue();				//unboxing
		int y=obj;							//autounboxing jdk1.5 or above
		System.out.println(" ");
	}
}

