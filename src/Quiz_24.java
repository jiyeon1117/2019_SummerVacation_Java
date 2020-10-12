import java.util.Scanner;

public class Quiz_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n번째 수열 구하기
		int count = 0, total = 0, no = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("n번째 값을 입력 : ");
		int limit = scan.nextInt();
		
		while(total<limit) {
			no++;
			count = 1;
			while(count<=no){
				total++;
				if(total>limit) 
					break;
					System.out.printf("%4d", no);
					count++;
				if(total%10==0)
					System.out.println();
			}
		}
		System.out.println(limit + "번째 수열의 값은 " + no + "입니다.");
		
		
		
	}//end of main
}//end of class
