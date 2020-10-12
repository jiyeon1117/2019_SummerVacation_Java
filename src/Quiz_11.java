import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;

/* 숫자는 숫자형 숫자 1 2 3 연산 O
 * 문자형 숫자 "1", "1, 2" 연산 X
 * 문자형 숫자를 "1 2 3 4"
 * 총합은 10 
 */
public class Quiz_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자형 숫자를 입력하세요 : ");
		String su = scan.next();
		int sum = 0;
		
		for (int i=0; i<su.length(); i++) {
			sum += su.charAt(i)-'0';
		}
		
		System.out.println("총합 = " + sum);
		
		
	}//end of main
}//end of class
