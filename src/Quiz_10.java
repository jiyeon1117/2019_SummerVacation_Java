import java.util.Scanner;
/*
 * �Ǻ���ġ ����
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 * i���� �Ǻ���ġ ������ �Է� : 
 */
public class Quiz_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("i��° �Ǻ���ġ ������ �Է� : ");
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