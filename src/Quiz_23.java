import java.util.Scanner;

public class Quiz_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7���� �������� �Է¹޾� �迭�� �ְ�
		//����������, �ִ밪�� �ּҰ� ���
		int num[] = new int[7];
		int max = num[0];
		int min = num[0];
		Scanner scan = new Scanner(System.in);
		System.out.print("7���� ������ �Է��ϼ��� : ");
		
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
			if(i==0) {
				min = num[i];
			}else if(num[i] > max) {
				max = num[i];
			}else if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println();
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
	}//end of main
}//end of class
