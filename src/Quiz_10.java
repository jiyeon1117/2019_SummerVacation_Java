import java.util.Scanner;
/*
 * 피보나치 수열
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 * i번쨰 피보나치 수열을 입력 : 
 */
public class Quiz_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("i번째 피보나치 수열을 입력 : ");
		int count = scan.nextInt();
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print(num1 + ", " + num2);
		for (int i=1; i<=(count-2); i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}//end of for
		
	}//end of main
}//end of class