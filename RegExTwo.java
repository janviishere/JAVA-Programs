import java.util.regex.*;

class RegExTwo{
	public static void main(String args[]){
		Pattern p=Pattern.compile("College",Pattern.CASE_INSENSITIVE);
		Boolean b=Matcher.Find();
		if(b){
			System.out.println("Match Found");
		}
		else{
			System.out.println("Match not found");
		}
		}
	}

	