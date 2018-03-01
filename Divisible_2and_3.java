import java.util.Scanner;
public class Divisible_2and_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		
		
		if((num%2==0) && (num%3==0)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}

}
