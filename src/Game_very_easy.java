import java.util.Scanner;

public class Game_very_easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com, you;
		Scanner scan = new Scanner(System.in);
		String yn;
		
		while (true) {
			com = (int)(Math.random() * 3) + 1;
			System.out.println(com);
			System.out.print("1: ���� 2: ���� 3: ��  ==>  ");
			you = scan.nextInt();
			
			//com, you ��
			//�ʱ� ����
			if(com==1) { //��ǻ�� ����
				switch (you) {
				case 1:
					System.out.println("��ǻ��:����, �����:���� ==> �����ϴ�.");
					break;
				case 2:
					System.out.println("��ǻ��:����, �����:���� ==> ����ڰ� �̰���ϴ�.");
					break;
				case 3:
					System.out.println("��ǻ��:����, �����:�� ==> ��ǻ�Ͱ� �̰���ϴ�.");
					break;
				default:
					System.out.println("1~3 ������ ������ �Է����ּ���");
					break;
				}
			}else if(com==2) { //��ǻ�� ����
				switch (you) {
				case 1:
					System.out.println("��ǻ��:����, �����:���� ==> ��ǻ�Ͱ� �̰���ϴ�.");
					break;
				case 2:
					System.out.println("��ǻ��:����, �����:���� ==> �����ϴ�.");
					break;
				case 3:
					System.out.println("��ǻ��:����, �����:�� ==> ����ڰ� �̰���ϴ�.");
					break;
				default:
					System.out.println("1~3 ������ ������ �Է����ּ���");
					break;
				}
			}else if(com==3) { //��ǻ�� ��
				switch (you) {
				case 1:
					System.out.println("��ǻ��:��, �����:���� ==> ����ڰ� �̰���ϴ�.");
					break;
				case 2:
					System.out.println("��ǻ��:��, �����:���� ==> ��ǻ�Ͱ� �̰���ϴ�.");
					break;
				case 3:
					System.out.println("��ǻ��:��, �����:�� ==> �����ϴ�.");
					break;
				default:
					System.out.println("1~3 ������ ������ �Է����ּ���");
					break;
				}
			}
			
			
			
			
			System.out.println("����Ͻðڽ��ϱ�? (y|n) : ");
			yn = scan.next();
			if(yn.equals("n") || yn.equals("N")) break;
		}
	}

}
