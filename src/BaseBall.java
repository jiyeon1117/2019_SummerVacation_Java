import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int com1, com2, com3;
		int num1, num2, num3;
		int count = 0;
		int s = 0;
		int b = 0;
		
		com1 = (int)(Math.random() * 9) + 1;
		
		do {
			com2 = (int)(Math.random() * 9) + 1;
		}while(com1==com2);
			
		do {
			com3 = (int)(Math.random() * 9) + 1;
		}while(com3==com1 || com3==com2);
		
		//System.out.println(com1 + " " + com2 + " " + com3);
		
		do {
			count++;
			System.out.print("1~9������ ���� 3���� �Է��ϼ���(ex : 1 2 3) : ");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();
			
			s = 0;
			b = 0;
			
			if(num1==com1) {
				s++;
			}else if (num1==com2 || num1==com3) {
				b++;
			}
			
			if (num2==com2) {
				s++;
			}else if (num2==com1 || num2==com3) {
				b++;
			}
			
			if (num3==com3) {
				s++;
			}else if (num3==com1 || num3==com2) {
				b++;
			}
			System.out.println("[" + s + "S, " + b + "B]");
			
		}while(s!=3);
		
		System.out.println("�����մϴ�! �����Դϴ�.");
		System.out.println(count + "�� ���� ���߼̽��ϴ�.");
	}//end of main

}//end of class



//		while(true) {
//			count++;
//			System.out.print("1~9������ �ߺ����� �ʴ� ���� �Է� ���� �Է� : ");
//			num1 = scan.nextInt();
//			num2 = scan.nextInt();
//			num3 = scan.nextInt();
//			
//			if (num1==com1 && num2==com2 && num3==com3) {
//				score = "3S";
//			}else if (num1==com1 && num2==com2) {
//				score = "2S";
//			}else if (num2==com2 && num3==com3) {
//				score = "2S";	
//			}else if(num1==com1 && num3==com3) {
//				score = "2S";
//			}else if (num1==com1 || num2==com2 || num3==com3){
//				score = "1S";
//			}else if (num1!=com1 && num2!=com2 && num3!=com3) {
//				score = "";
//			}else if (num2==com1 || num2==com3) {
//				System.out.println("B");
//			}else {
//				System.out.println("�����Դϴ�.");
//				break;
//			}//end of if
//			break;
//		}//end of while