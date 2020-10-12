import java.util.Scanner;

public class Quiz_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//삼항 연산자
//		int a = 1;
//		int su; //a가 1이면 su=2, a가 1이 아니면 su=3
//		
////		if(a==1) {
////			su=2;
////		}else {
////			su=3;
////		}
//		
//		//조건 ? true : false
//		su = (a==1) ? 2 : 3;
//		System.out.println(su);
		
		//삼항 연산자를 사용해서 숫자, 대문자, 소문자 한글자를 입력받아
		//대문자만 소문자로 바꿔서 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자, 대문자 소문자 중 한 글자를 입력하세요 : ");
		String su = scan.next();   // su = "ABCD"
		char ch = su.charAt(0);
		char ch1;
//		if(ch>='A' && ch<='Z') {
//			ch1 = (char)(ch + 32);
//		}else {
//			ch1 = ch;
//		}
		ch1 = (ch>='A' && ch<='Z') ? (char)(ch + 32) : ch;
		System.out.println("입력한 문자 = " + ch + ",  변환된 문자 = " + ch1);
		
		
	}//end of main
}//end of class
