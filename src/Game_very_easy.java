import java.util.Scanner;

public class Game_very_easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com, you;
		Scanner scan = new Scanner(System.in);
		String yn;
		
		while (true) {
			com = (int)(Math.random() * 3) + 1;
			System.out.println(com);
			System.out.print("1: 가위 2: 바위 3: 보  ==>  ");
			you = scan.nextInt();
			
			//com, you 비교
			//초급 과정
			if(com==1) { //컴퓨터 가위
				switch (you) {
				case 1:
					System.out.println("컴퓨터:가위, 사용자:가위 ==> 비겼습니다.");
					break;
				case 2:
					System.out.println("컴퓨터:가위, 사용자:바위 ==> 사용자가 이겼습니다.");
					break;
				case 3:
					System.out.println("컴퓨터:가위, 사용자:보 ==> 컴퓨터가 이겼습니다.");
					break;
				default:
					System.out.println("1~3 사이의 정수만 입력해주세요");
					break;
				}
			}else if(com==2) { //컴퓨터 바위
				switch (you) {
				case 1:
					System.out.println("컴퓨터:바위, 사용자:가위 ==> 컴퓨터가 이겼습니다.");
					break;
				case 2:
					System.out.println("컴퓨터:바위, 사용자:바위 ==> 비겼습니다.");
					break;
				case 3:
					System.out.println("컴퓨터:바위, 사용자:보 ==> 사용자가 이겼습니다.");
					break;
				default:
					System.out.println("1~3 사이의 정수만 입력해주세요");
					break;
				}
			}else if(com==3) { //컴퓨터 보
				switch (you) {
				case 1:
					System.out.println("컴퓨터:보, 사용자:가위 ==> 사용자가 이겼습니다.");
					break;
				case 2:
					System.out.println("컴퓨터:보, 사용자:바위 ==> 컴퓨터가 이겼습니다.");
					break;
				case 3:
					System.out.println("컴퓨터:보, 사용자:보 ==> 비겼습니다.");
					break;
				default:
					System.out.println("1~3 사이의 정수만 입력해주세요");
					break;
				}
			}
			
			
			
			
			System.out.println("계속하시겠습니까? (y|n) : ");
			yn = scan.next();
			if(yn.equals("n") || yn.equals("N")) break;
		}
	}

}
