import java.util.Scanner;

public class Quiz_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String �迭�� 5���� ģ���̸��� Ű����κ��� �Է¹޾� �����ϰ�
		//¦����° �л� �̸��� ���
		String name[] = new String[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("5���� �̸��� �Է��ϼ��� : ");
		for (int i=0; i<name.length; i++) {
			name[i] = scan.next();
			if((i+1)%2==0) {
				System.out.println("¦����° �л� �̸��� : " + name[i]);
			}
		}
		
		
		
		
		
		
	}//end of main
}//end of class
