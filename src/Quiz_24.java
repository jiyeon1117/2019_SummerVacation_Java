import java.util.Scanner;

public class Quiz_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n��° ���� ���ϱ�
		int count = 0, total = 0, no = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("n��° ���� �Է� : ");
		int limit = scan.nextInt();
		
		while(total<limit) {
			no++;
			count = 1;
			while(count<=no){
				total++;
				if(total>limit) 
					break;
					System.out.printf("%4d", no);
					count++;
				if(total%10==0)
					System.out.println();
			}
		}
		System.out.println(limit + "��° ������ ���� " + no + "�Դϴ�.");
		
		
		
	}//end of main
}//end of class
