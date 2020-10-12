import java.util.Scanner;

public class Quiz_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 배열에 5명의 친구이름을 키보드로부터 입력받아 저장하고
		//짝수번째 학생 이름만 출력
		String name[] = new String[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("5명의 이름을 입력하세요 : ");
		for (int i=0; i<name.length; i++) {
			name[i] = scan.next();
			if((i+1)%2==0) {
				System.out.println("짝수번째 학생 이름은 : " + name[i]);
			}
		}
		
		
		
		
		
		
	}//end of main
}//end of class
