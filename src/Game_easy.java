import java.util.Scanner;


public class Game_easy {

	public static final int ���� = 1;
	public static final int ���� = 2;
	public static final int �� = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com, you;
		Scanner scan = new Scanner(System.in);
		String yn;
		
		while (true) {
			com = (int)(Math.random() * 3) + 1;
			//System.out.println(com);
			System.out.print("1: ���� 2: ���� 3: ��  ==>  ");
			you = scan.nextInt();
			
			//com, you ��
			//�߱��ڽ� 1, 3
			switch (com) {
			case 1:
				System.out.println("��ǻ�� : ����\t");
				break;
			case 2:
				System.out.println("��ǻ�� : ����\t");
				break;
			case 3:
				System.out.println("��ǻ�� : ��\t");
				break;
			default:
				break;
			}
			
			switch (you) {
			case 1:
				System.out.println("��ǻ�� : ����\t");
				break;
			case 2:
				System.out.println("��ǻ�� : ����\t");
				break;
			case 3:
				System.out.println("��ǻ�� : ��\t");
				break;
			default:
				break;
			}
			
			if((com==���� && you==����) || (com==���� && you==��) || (com==�� && you==����)) {
				System.out.print("==> ����ڰ� �̰���ϴ�.");
			}else if(com==you) {
				System.out.println("==> �����ϴ�.");
			}else {
				System.out.println("==> ��ǻ�Ͱ� �̰���ϴ�.");
			}
						
			System.out.println("����Ͻðڽ��ϱ�? (y|n) : ");
			yn = scan.next();
			if(yn.equals("n") || yn.equals("N")) break;
		}
	}

}
