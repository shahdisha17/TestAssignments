package PracticeProblems;

public class VowelChar {

	public static void main(String[] args) {
		
		char c = 'Z';
		if(c=='a' || c=='A' || c=='e' || c=='E' ||c=='i'||c=='I'||c=='o' ||c=='O' ||c=='u'||c=='U') {
			System.out.println("Character " + c +" is vowel");
		}
		else{
			System.out.println("Character is consonant");
		}

	
	
		char ch='g';
		switch (ch) {
		
		case 'A':
		case 'a':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Character " + ch + " is vowel char.");
			break;
			default:
				System.out.println("Character is consonant");
			break;
		}
		

}
}