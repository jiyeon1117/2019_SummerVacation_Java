import java.util.Scanner;

//�̻��� ������ ==> �迭�� �̿�
public class Project_03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���3 : �迭 �� �ݺ����� �� ���� ����ϱ�
		String one[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
		Scanner scan = new Scanner(System.in);
		int choice;
		int len = one.length;
		
		for(int i=0; i<3; i++) {
			for(int j=0, x=0; j<len; j+=2, x++) {
				System.out.println((j+1) + "�� " + one[j] + "\t" + (j+2) + "�� " + one[j+1]);
				choice = scan.nextInt(); 
				if(choice==(j+1) || choice==(j+2)) {
					one[x] = one[choice-1];
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. " + (j+1) + "�Ǵ�" + (j+2) + "�� �Է����ּ���.");
					j -= 2;
					continue;
				}
				
			}for(int k=0; k<one.length; k++) {
					System.out.print(one[k] + "\t");
				}
				System.out.println();
				len = len / 2;
		}
			
		System.out.println();		
		System.out.println("����� ���� ������ " + one[0] + "�Դϴ�");
		
	}

}
