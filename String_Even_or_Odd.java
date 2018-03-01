import java.util.Scanner;

public class String_Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=in.next();
		String text=word;
		String W1=Even(word);
		System.out.println(W1);
		
	}
	
	public static String Even(String text) {
		int W=text.length();
		if(W%2==0) {
			
			return "true";
			
		}
		else {
			return "false";
			
		}
	
		
	}

}
