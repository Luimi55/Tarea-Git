import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anagrama {
	

	public static void main(String[] args) {
		
	}
	
	public static boolean anagramas(String palabra1, String palabra2) {
		int i =0;
		boolean matchFound = true;
		boolean matchFound1 = true;
		
		while((i < palabra1.length()) && (matchFound == true) && (matchFound1 == true)) {
			Pattern pattern = Pattern.compile("["+palabra1.charAt(i)+"]", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(palabra2);
		    matchFound = matcher.find();

		    Pattern pattern1 = Pattern.compile("["+palabra2.charAt(i)+"]", Pattern.CASE_INSENSITIVE);
		    Matcher matcher1 = pattern1.matcher(palabra1);
		    matchFound1 = matcher1.find();
		    
		    i++;
		}

		return matchFound && matchFound1;
	}
	

}
