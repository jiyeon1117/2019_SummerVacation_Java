import java.util.Scanner;
//Study_04 �������� Ǯ���ֽô� ��
public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random() * 100) + 1;
		//System.out.println(com);
		Scanner scan = new Scanner(System.in);
		int you;
		int count = 0;
		
		while (true) {
			count++;
			System.out.print("1~100������ ���� �Է� : ");
			you = scan.nextInt();
			
			if (you < com) {
				System.out.println("�� �� ū ���� �Է��ϼ���. ");
			}else if (you > com) {
				System.out.println("�� �� ���� ���� �Է��ϼ���. ");
			}else {
				System.out.println("�����Դϴ�.");
				break;
			}//end of if
			System.out.println();
		}//end of while
		
		System.out.println(count+"��°�� ���߼̽��ϴ�. ");
		if (count<=4) {
			System.out.println("Great");
		}else if (count<=8) {
			System.out.println("Good");
		}else {
			System.out.println("����ϼ���.");
		}//end of if
		
	}//end of main

}//end of class
