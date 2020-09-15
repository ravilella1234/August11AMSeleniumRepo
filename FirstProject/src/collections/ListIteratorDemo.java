package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("ravikanth");
		a.add("lella");
		a.add("sai");
		a.add("keerthan");
		
		System.out.println(a);
		
		ListIterator<String> var = a.listIterator();
		while(var.hasNext())
		{
			String val = var.next();
			if(val.contains("ravikanth"))
				var.set("ravikanthlella");
			else
				var.remove();
		}
		System.out.println(a);
	}

}
