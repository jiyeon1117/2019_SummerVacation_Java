import java.util.Scanner;

public class Game_very_hard {
	
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
			//�ְ���ڽ�
			switch ((you-com+3)%3) {
				case 1:
					System.out.println("������� �¸�");
					break;
				case 2:
					System.out.println("��ǻ���� �¸�");
					break;
				case 0:
					System.out.println("�����ϴ�.");
					break;
				default:
					break;
				}
			
			System.out.println("����Ͻðڽ��ϱ�? (y|n) : ");
			yn = scan.next();
			if(yn.equals("n") || yn.equals("N")) break;			
		}
		
	}//end of main
}//end of class
