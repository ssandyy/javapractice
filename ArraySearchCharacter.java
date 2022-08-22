package learn_java;

public class ArraySearchCharacter {
	public static void main(String[] args) {
		
		String str[] = {"san", "sev", "kdl", "ef", "uji"};
		String match[];
		String k = "a";
		
		for(int i=0; i<str.length; i++) {
			
			for(int j=0; j<=i; j++) {
				
				if(str[i]==k) {
					match.push(str[i]);
					break;
				}
					
			}
		}
	}
}
