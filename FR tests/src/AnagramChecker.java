import java.util.*;

public class AnagramChecker
	{
	public static void main(String[] args)
		{
		isAnagram("peach", "cheAp");
		}
	
	public static boolean isAnagram(String word1, String word2)
		{
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		// for the very OCD amongst us
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		
		for(int i = 0; i < word1.length(); i++)
			{
			a.add(word1.substring(i, i + 1));
			}
		
		for(int i = 0; i < word2.length(); i++)
			{
			b.add(word2.substring(i, i + 1));
			}
		
		Collections.sort(a);
		Collections.sort(b);

		if (a.equals(b))
			{
			System.out.println("It's an anagram.");
			return true;
			}
		else
			{
			System.out.println("It's not an anagram.");
			return false;
			}
		}
	}
