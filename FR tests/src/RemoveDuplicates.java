import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates
	{
	public static void main(String[] args)
		{
		removeDuplicates("moose");
		}
	
	public static ArrayList<String> removeDuplicates(String word)
		{
		ArrayList<String> a = new ArrayList<String>();
		
		for(int i = 0; i < word.length(); i++)
			{
			a.add(word.substring(i, i + 1));
			}

		Collections.sort(a);
		
		for (int i = a.size() - 1; i > 0; i--)
			{
			if (a.get(i).equals(a.get(i - 1)))
				{
				a.remove(i);
				}
			}
		
		for (String s : a)
			{
			System.out.print(s);
			}
		return a;
		}
	}
