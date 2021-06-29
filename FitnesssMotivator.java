import java.util.Scanner;

public class FitnesssMotivator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("did you workout today? 1 for yes 2 for no");

		int n = scan.nextInt();

		if (n >= 0 && n <= 1) {

			System.out.println("yay! keep it up!");

		} else if (n >= 2 && n < 3) {

			System.out.println("you should work out tommorow you got this!");

		} else {

			System.out.println("enter 1 or 2");

		}
	}

}