package homeassignments;

public class Findduplicatesinstring {
	public static void main(String[] args) {
		String s="We learn java basics as part of java sessions in java week1";	
		String words[] = s.split(s);  
System.out.println("Duplicate characters in a given string: ");
int count;
for(int i=0;i<words.length;i++) {
	count =1;
	for (int j=0;j<=words.length;j++) {
		if(words[i]==words[j]) {
			System.out.println(words[j]);
			
		}
	} 
		
	}
}
 	
	}


