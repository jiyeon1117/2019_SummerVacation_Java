import java.util.Scanner;

/*
 * 0���� 100 ������ ������ ������ �Է� �޾� �� ��� �Է� ���� ���
 */
public class Quiz_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, avg = 0, count = 0;
		Scanner scan = new Scanner(System.in);
		int num;
		
		while (true) {
			System.out.print("������ �Է��ϼ��� : ");
			num = scan.nextInt();
			if (num<0) {
				break;
			}else if (num>100) {
				continue;
			}else {
				sum += num;
				count++;
			}
				
				
		}
		avg = sum / count;
		System.out.println("���� : " + sum + " ��� : "+ avg + " ���� : "+ count);
		
		
		
		
	}//end of main
}//end of class
