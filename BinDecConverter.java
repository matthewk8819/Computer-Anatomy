import java.util.*;


public class BinDecConverter {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("If you would like to convert binary to decimal, enter '1'. If you would like to convert decimal to binary, enter '2'.");
		int choice = in.nextInt();
		System.out.print("Please enter in a number to be converted: ");
		String num = in.next();
		
		
		if (choice==1) {
			int[] numArray = new int[num.length()]; //array of digits from the last digit to the first digit (ex 123 would be [3,2,1]
			int c = 0;
			for (int i = num.length()-1; i>=0; i--) {
				numArray[c] = Integer.parseInt(""+num.charAt(i));
				c++;
			}
			int decimal = 0;
			int factor = 1; 
			for (int i = 0; i < num.length(); i++) {
				decimal+=numArray[i]*factor;
				factor*=2;
			}
			System.out.println("Your converted decimal number is: " + decimal);
			
		}
		else if (choice==2) {
			String binaryReverse = "";
			int n = Integer.parseInt(num);
			while (n!=0) {
				binaryReverse+=(n%2);
				n=n/2;
			}
			String binary = "";
			for (int i = binaryReverse.length()-1; i >=0; i--) {
				binary+=binaryReverse.charAt(i);
			}
			System.out.println("Your converted binary number is: " + binary);
		}
		else {
			System.out.println("F*** off lol");
		}
		
		
	}

}
