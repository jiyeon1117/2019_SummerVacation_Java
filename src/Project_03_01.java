import java.util.Scanner;

//�̻��� ������ ==> �迭�� �̿�
public class Project_03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���2 : �ϳ��� �迭�� ���
		String one[] = {"¥���", "«��", "�Ķ��̵�ġŲ", "���ġŲ", "����ø�", "���ø�", "�������", "������"};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** �̻��� ������ - ����� ������ ? ***");
		System.out.println();
		
		for(int i=0; i<one.length; i+=2) {
			System.out.println("1�� " + one[i] + "\t" + "2�� " + one[i+1]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				one[i+1] = one[i];
			}else if(choice==2){
				one[i] = one[i+1];
			}else {
				System.out.println("1 �Ǵ� 2�� �Է����ּ���.");
				System.out.println();
				i -= 2;
				continue;
			}
		}
		System.out.println();
		
		for(int i=0; i<one.length; i+=4) {
			System.out.println("1�� " + one[i] + "\t" + "2�� " + one[i+2]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				one[i] = one[1];
			}else if(choice==2){
				one[i] = one[i+2];
			}else {
				System.out.println("1 �Ǵ� 2�� �Է����ּ���.");
				System.out.println();
				i -= 4;
				continue;
			}
		}
		System.out.println();
		
		for(int i=0; i<one.length/2; i+=4) {
			System.out.println("1�� " + one[i] + "\t" + "2�� " + one[i+4]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				one[i] = one[1];
			}else if(choice==2){
				one[i] = one[i+4];
			}else {
				System.out.println("1 �Ǵ� 2�� �Է����ּ���.");
				System.out.println();
				i -= 2;
				continue;
			}
		}
		System.out.println();
		
		System.out.println("����� ���� ������ " + one[0] + "�Դϴ�");
		
	}

}
