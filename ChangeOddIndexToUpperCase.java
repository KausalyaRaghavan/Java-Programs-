package homeassignments;

public class ChangeOddIndexToUpperCase {
public static void main(String[] args) {
	String s="kausalya";
	int length = 0;
	for (int i=0;length<=s.length();i++) {
		char charAt = s.charAt(i);
		if (i%2==0) {
			System.out.println(Character.toUpperCase(charAt));
			}
		else {
			System.out.println(Character.toLowerCase(charAt));
			
		}
		
		
	}
	

		
	
			
		

	}
	
}

	
	

