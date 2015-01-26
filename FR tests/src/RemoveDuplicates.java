import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates
	{
	static ArrayList<Integer> myArray = new ArrayList<Integer>();

	public static void main(String[] args)
		{
		myArray.add(1);
		myArray.add(1);
		myArray.add(2);
		myArray.add(2);
		myArray.add(3);
		myArray.add(3);
		removeDuplicates(myArray);
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
