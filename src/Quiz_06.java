import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//본인의 나이를 입력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println(age + "세는 " + getage(age) + "입니다");
	}//end of main
	
	public static String getage(int age) {
		String name;
		switch(age/10) {
		case 0 : case 1 :
			name = "10대 이하";
			break;
		case 2 :
			name = "20대 이상";
			break;
		case 3 :
			name = "30대 이상";
			break;
		default :
			name = "40대 이상";
			break;
		}//end of switch
		
		return name;
	}//end of getage
}//end of class
