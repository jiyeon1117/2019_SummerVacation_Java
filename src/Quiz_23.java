import java.util.Scanner;

public class Quiz_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7개의 정수값을 입력받아 배열에 넣고
		//원본데이터, 최대값과 최소값 출력
		int num[] = new int[7];
		int max = num[0];
		int min = num[0];
		Scanner scan = new Scanner(System.in);
		System.out.print("7개의 정수를 입력하세요 : ");
		
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
			if(i==0) {
				min = num[i];
			}else if(num[i] > max) {
				max = num[i];
			}else if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}//end of main
}//end of class
