import java.util.Scanner;

//���� ���Ǳ� ���α׷�
public class Project_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String choice = null;
		int money, menu, pay;
		int m1000=0, m500=0, m100=0, m10=0;
		String drink = "", select = "";
		
		System.out.println("==========================================================");
		System.out.println("1. �ݶ�(600won) 2. ȯŸ(550won) 3. Ŀ��(370won) 4. ��(420won)");
		System.out.println("==========================================================");
		System.out.println();
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		money = scan.nextInt();
		
		do {
			System.out.print("���Ḧ �����ϼ��� : ");
			menu = scan.nextInt();	//menu = 1 ~ 4
			switch (menu) {
			case 1:
				pay = 600;
				select = "�ݶ�";
				break;
			case 2:
				pay = 550;
				select = "ȯŸ";
				break;
			case 3:
				pay = 370;
				select = "Ŀ��";
				break;
			case 4:
				pay = 420;
				select = "��";
				break;
			default:
				System.out.println("�޴��� �ٽ� �����ϼ���(1~4)");
				continue;
			}
			if(money < pay) {
				System.out.println("�ܾ��� �����մϴ�.");
				System.exit(0);
			}else {
				//money = money - pay;
				money -= pay;
				drink = drink + select + " ";
				
				m1000 = money / 1000;
				m500 = (money % 1000) / 500;
				m100 = ((money % 1000) % 500) / 100;
				m10 = (((money % 1000) % 500) % 100) / 10;
				
				System.out.println("�ܾ��� " + money + "�Դϴ�.");
			}
			System.out.println();
			System.out.print("�߰� �����Ͻðڽ��ϱ�?(y or n) : ");
			choice = scan.next();
		}while(choice.equals("Y") || choice.equals("y"));
		
		System.out.println("������ ������� : " + drink + "�̸�, �Ž������� " + money + "�� �Դϴ�.");
		System.out.printf("1000�� : %d��, 500�� : %d��, 100�� : %d��, 10�� : %d���Դϴ�.", m1000, m500, m100, m10);
	}

}
