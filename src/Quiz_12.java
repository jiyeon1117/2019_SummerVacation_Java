import java.util.Scanner;

public class Quiz_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		int sum = 0;
		
		while (num > 0) {
			sum += num%10 ;
			num = num /10;
		}
		System.out.println("���� = " + sum);
		
			
		
	}

}
