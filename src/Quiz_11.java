import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;

/* ���ڴ� ������ ���� 1 2 3 ���� O
 * ������ ���� "1", "1, 2" ���� X
 * ������ ���ڸ� "1 2 3 4"
 * ������ 10 
 */
public class Quiz_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ���ڸ� �Է��ϼ��� : ");
		String su = scan.next();
		int sum = 0;
		
		for (int i=0; i<su.length(); i++) {
			sum += su.charAt(i)-'0';
		}
		
		System.out.println("���� = " + sum);
		
		
	}//end of main
}//end of class
