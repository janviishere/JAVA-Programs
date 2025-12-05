import java.util.regex.*;
class RegExDemo{
	public static void main(String args[])
	{
		int count=0;
	Pattern p=Pattern.compile("ab");
	Matcher m=p.matcher("ababbaba");
	while(m.find())
	{
		count++;
	//	System.out.println("Matcher found");
		System.out.println("Match Found"+m.start());
	}
	System.out.println("Repeated value : "+count);
	}
}