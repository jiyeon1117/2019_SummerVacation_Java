import java.util.Scanner;

/*
 * 0에서 100 사이의 정수를 여러개 입력 받아 합 평균 입력 개수 출력
 */
public class Quiz_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, avg = 0, count = 0;
		Scanner scan = new Scanner(System.in);
		int num;
		
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			num = scan.nextInt();
			if (num<0) {
				break;
			}else if (num>100) {
				continue;
			}else {
				sum += num;
				count++;
			}
				
				
		}
		avg = sum / count;
		System.out.println("총합 : " + sum + " 평균 : "+ avg + " 개수 : "+ count);
		
		
		
		
	}//end of main
}//end of class
