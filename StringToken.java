import java.util.StringTokenizer;

public class StringToken{
	public static void main(String args[]){
		String s="Hello Janvi here";
		StringTokenizer st = new StringTokenizer(s," ");

		while(st.hasMoreTokens()) {
			System.out.println("String: "+st.nextToken());
		}
	}
}