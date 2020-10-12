import java.util.Scanner;

//정수 하나를 입력해서 짝수인지 홀수인지 판별
public class Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + "은(는) 짝수입니다.");
		}else {
			System.out.println(num + "은(는) 홀수입니다.");
		}//end of if
		
	}//end of main
}//end of class
