import java.util.Scanner;

public class Quiz_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while���� �̿��� ��� ���ϱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		int su = 1;
		
		while(num>=su) {
			if (num%su==0) {
				System.out.print(su + " ");
			}
			su++;
		}
		
	}
}
