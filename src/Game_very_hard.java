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
			System.out.print("1: 가위 2: 바위 3: 보  ==>  ");
			you = scan.nextInt();
			
			//com, you 비교
			//최고급코스
			switch ((you-com+3)%3) {
				case 1:
					System.out.println("사용자의 승리");
					break;
				case 2:
					System.out.println("컴퓨터의 승리");
					break;
				case 0:
					System.out.println("비겼습니다.");
					break;
				default:
					break;
				}
			
			System.out.println("계속하시겠습니까? (y|n) : ");
			yn = scan.next();
			if(yn.equals("n") || yn.equals("N")) break;			
		}
		
	}//end of main
}//end of class
