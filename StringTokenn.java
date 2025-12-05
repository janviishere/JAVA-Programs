import java.util.StringTokenizer;

public class StringTokenn{
	public static void main(String args[]){
		String s="8*4/2+10-2";
		StringTokenizer st = new StringTokenizer(s,"*/ ");

		while(st.hasMoreTokens()) {
			System.out.println("String: "+st.nextToken());
		}
	}
}