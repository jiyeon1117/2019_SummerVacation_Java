import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ���̸� �Է��ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.println(age + "���� " + getage(age) + "�Դϴ�");
	}//end of main
	
	public static String getage(int age) {
		String name;
		switch(age/10) {
		case 0 : case 1 :
			name = "10�� ����";
			break;
		case 2 :
			name = "20�� �̻�";
			break;
		case 3 :
			name = "30�� �̻�";
			break;
		default :
			name = "40�� �̻�";
			break;
		}//end of switch
		
		return name;
	}//end of getage
}//end of class
