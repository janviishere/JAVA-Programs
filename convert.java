import java.util.*;
class convert
{
	public static void main(String args[])
	{
	StringBuilder sb=new StringBuilder("Janvi Gupta");

	for(int i=0;i<sb.length();i++)
	{
	if(i%2==0)
	{
	sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
	}
    }
System.out.println("Converted: "+sb.toString());
}
}