import java.util.Scanner;

public class Quiz_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//���� ������
//		int a = 1;
//		int su; //a�� 1�̸� su=2, a�� 1�� �ƴϸ� su=3
//		
////		if(a==1) {
////			su=2;
////		}else {
////			su=3;
////		}
//		
//		//���� ? true : false
//		su = (a==1) ? 2 : 3;
//		System.out.println(su);
		
		//���� �����ڸ� ����ؼ� ����, �빮��, �ҹ��� �ѱ��ڸ� �Է¹޾�
		//�빮�ڸ� �ҹ��ڷ� �ٲ㼭 ���
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����, �빮�� �ҹ��� �� �� ���ڸ� �Է��ϼ��� : ");
		String su = scan.next();   // su = "ABCD"
		char ch = su.charAt(0);
		char ch1;
//		if(ch>='A' && ch<='Z') {
//			ch1 = (char)(ch + 32);
//		}else {
//			ch1 = ch;
//		}
		ch1 = (ch>='A' && ch<='Z') ? (char)(ch + 32) : ch;
		System.out.println("�Է��� ���� = " + ch + ",  ��ȯ�� ���� = " + ch1);
		
		
	}//end of main
}//end of class
