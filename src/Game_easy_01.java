import java.util.Scanner;

public class Game_easy_01 {

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
			//�߱��ڽ� 2
			System.out.println("��ǻ�� : " + print(com));
			System.out.println("����� : " + print(you));
			
			if((com==1 && you==2) || (com==2 && you==3) || (com==3 && you==1)) {
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
	}//end of main
	
	public static String print(int su) {
		String result;
		
		if(su==1) {
			result = "����\t";
		}else if(su==2) {
			result = "����\t";
		}else if(su==3) {
			result = "��\t";
		}else {
			result ="1~3 ������ ���ڸ� �Է����ּ���. \t";
		}
		
		return result;
	}

}
