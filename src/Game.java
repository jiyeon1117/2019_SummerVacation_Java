import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com, you, y=1, n=0;
		int num=0;
		String an, rock;
		Scanner scan = new Scanner(System.in);
		
		
		do {
			num++;
			com = (int)(Math.random() * 3) + 1;
//			System.out.println(com);
			System.out.print("(1: ���� , 2: ���� 3: ��) : ");
			you = scan.nextInt();
			
			if(com==1 && you==1) {
				System.out.println("��ǻ�� : ����, ����� : ����  ==> �����ϴ�");
			}
			else if(com==2 && you==2) {
				System.out.println("��ǻ�� : ����, ����� : ����  ==> �����ϴ�");
			}
			else if(com==3 && you==3) {
				System.out.println("��ǻ�� : ��, ����� : ��  ==> �����ϴ�");
			}
			else if(com==1 && you==2) {
				System.out.println("��ǻ�� : ����, ����� : ����  ==> ����ڰ� �̰���ϴ�");
			}
			else if(com==1 && you==3) {
				System.out.println("��ǻ�� : ����, ����� : ��  ==> ��ǻ�Ͱ� �̰���ϴ�");
			}
			else if(com==2 && you==1) {
				System.out.println("��ǻ�� : ����, ����� : ����  ==> ��ǻ�Ͱ� �̰���ϴ�");
			}
			else if(com==2 && you==3) {
				System.out.println("��ǻ�� : ����, ����� : ��  ==> ����ڰ� �̰���ϴ�");
			}
			else if(com==3 && you==1) {
				System.out.println("��ǻ�� : ��, ����� : ����  ==> ����ڰ� �̰���ϴ�");
			}
			else if(com==3 && you==2) {
				System.out.println("��ǻ�� : ��, ����� : ����  ==> ��ǻ�Ͱ� �̰���ϴ�");
			}
			System.out.print("����Ͻðڽ��ϱ�(y|n)? : ");
			an = scan.next();
			if(an.equals("y")) {
				continue;
			}
			else {
				break;
			}
		}while(true);
	}

}
