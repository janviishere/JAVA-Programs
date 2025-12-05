import java.util.*;
class initials
{
	public static void main(String args[])
	{
	String name="Janvi Gupta";
	StringBuilder initials=new StringBuilder();

	//Split by Space
	String[] words=name.split(" ");
	for(String word:words)
	{
	if(!word.isEmpty())
	{
	initials.append(Character.toUpperCase(word.charAt(0)));
	}
	}
	System.out.println("Initials: "+initials.toString());
	}
}