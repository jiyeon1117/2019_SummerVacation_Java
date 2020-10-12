import java.util.Scanner;
//Study_04 선생님이 풀어주시는 답
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
			System.out.print("1~100사이의 정수 입력 : ");
			you = scan.nextInt();
			
			if (you < com) {
				System.out.println("좀 더 큰 수를 입력하세요. ");
			}else if (you > com) {
				System.out.println("좀 더 작은 수를 입력하세요. ");
			}else {
				System.out.println("정답입니다.");
				break;
			}//end of if
			System.out.println();
		}//end of while
		
		System.out.println(count+"번째에 맞추셨습니다. ");
		if (count<=4) {
			System.out.println("Great");
		}else if (count<=8) {
			System.out.println("Good");
		}else {
			System.out.println("노력하세요.");
		}//end of if
		
	}//end of main

}//end of class
