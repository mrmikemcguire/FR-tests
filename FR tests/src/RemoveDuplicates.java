import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates
	{
	static ArrayList<Integer> al = new ArrayList<Integer>();

	public static void main(String[] args)
		{
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(3);
		removeDuplicates(al);
		}
	
	public static ArrayList<Integer> removeDuplicates(ArrayList a)
		{
		for (int i = a.size() - 1; i > 0; i--)
			{
			if (a.get(i).equals(a.get(i - 1)))
				{
				a.remove(i);
				}
			}
		
		for (Object s : a)
			{
			System.out.print(s);
			}
		
		return a;
		}
	}
