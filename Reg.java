import java.util.regex.*;
class Reg{
	public static void main(String args[])
	{
	Pattern p=Pattern.compile("UP");
	Matcher m=p.matcher("Myself Janvi Gupta,Iam from UP,Kanpur Nagar.");
	if(m.find())
	{
	System.out.println("Match found");
	}
	else{
		System.out.println("Match not found");
	}
	}
}