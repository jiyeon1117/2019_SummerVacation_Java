import java.util.Scanner;

//���� �ϳ��� �Է��ؼ� ¦������ Ȧ������ �Ǻ�
public class Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + "��(��) ¦���Դϴ�.");
		}else {
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
		}//end of if
		
	}//end of main
}//end of class
