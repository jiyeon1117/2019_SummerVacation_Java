import java.util.Scanner;

public class Quiz_22_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = new String[5];
		Scanner scan = new Scanner(System.in);
		System.out.print("ģ�� �̸� 5�� �Է� : ");
		
		for(int i=0; i<name.length; i++) {
			name[i] = scan.next();
			if(i%2==1) {
				System.out.println(name[i]);
			}
		}
		
	}//end of main
}//end of class
