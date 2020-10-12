import java.util.Scanner;

//사람의 이름과 나이를 입력 받아 20세 이상이면 이름 님은 성년입니다 
//20세 미만이면 이름 님은 미성년자 입니다
public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
//		if (age >= 20) {
//			System.out.println(name + "님은 성년입니다.");
//		}else {
//			System.out.println(name + "님은 미성년자입니다. ");
//		}//end of if
		
		switch(age) { //(int)(10/age) case 0: case 1: 
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
			case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
				System.out.println(name + "님은 미성년자입니다. ");
				break;
			default :
				System.out.println(name + "님은 성년입니다. ");
				break;
		}//end of switch
				
	}//end of main
}//end of class
