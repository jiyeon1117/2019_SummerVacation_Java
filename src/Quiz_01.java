import java.util.Scanner;

//����� �̸��� ���̸� �Է� �޾� 20�� �̻��̸� �̸� ���� �����Դϴ� 
//20�� �̸��̸� �̸� ���� �̼����� �Դϴ�
public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scan.next();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		
//		if (age >= 20) {
//			System.out.println(name + "���� �����Դϴ�.");
//		}else {
//			System.out.println(name + "���� �̼������Դϴ�. ");
//		}//end of if
		
		switch(age) { //(int)(10/age) case 0: case 1: 
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
			case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
				System.out.println(name + "���� �̼������Դϴ�. ");
				break;
			default :
				System.out.println(name + "���� �����Դϴ�. ");
				break;
		}//end of switch
				
	}//end of main
}//end of class
