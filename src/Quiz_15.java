import java.util.Scanner;

public class Quiz_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문을 이용한 약수 구하기
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		int su = 1;
		
		while(num>=su) {
			if (num%su==0) {
				System.out.print(su + " ");
			}
			su++;
		}
		
	}
}
