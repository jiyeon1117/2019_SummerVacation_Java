import java.util.Scanner;

//�̻��� ������ ==> �迭�� �̿�
public class Project_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���1 : ���ο� �迭�� ����
		String one[] = {"¥���", "«��", "�Ķ��̵�ġŲ", "���ġŲ", "����ø�", "���ø�", "�������", "������"};
		String two[] = new String[4];
		String three[] = new String[2];
		String result = null;
		
		int c = 0, d = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("*** �̻��� ������ - ����� ������ ? ***");
		System.out.println();
		
		for(int i=0; i<one.length; i+=2) {
			System.out.println("1�� " + one[i] + "\t" + "2�� " + one[i+1]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				two[c] = one[i];
			}else if(choice==2){
				two[c] = one[i];
			}else {
				System.out.println("1 �Ǵ� 2�� �Է����ּ���.");
				System.out.println();
				i -= 2;
				continue;
			}
			c++;
		}
		System.out.println();
		
		for(int i=0; i<two.length; i+=2) {
			System.out.println("1�� " + two[i] + "\t" + "2�� " + two[i+1]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				three[d] = two[i];
			}else if(choice==2){
				three[d] = two[i];
			}else {
				System.out.println("1 �Ǵ� 2�� �Է����ּ���.");
				System.out.println();
				i -= 2;
				continue;
			}
			d++;
		}
		System.out.println();
		
		for(int i=0; i<three.length; i+=2) {
			System.out.println("1�� " + three[i] + "\t" + "2�� " + three[i+1]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				result = three[i];
			}else if(choice==2){
				result = three[i];
			}else {
				System.out.println("1 �Ǵ� 2�� �Է����ּ���.");
				System.out.println();
				i -= 2;
				continue;
			}
		}
		System.out.println();
		
//		for(int i=0; i<two.length; i++) {
//			System.out.println(two[i] + "\t");
//		}
//		System.out.println();
//		
//		for(int i=0; i<two.length; i++) {
//			System.out.println(three[i] + "\t");
//		}
		System.out.println();
		
		System.out.println("����� ���� ������ " + result + "�Դϴ�");
		
	}

}
