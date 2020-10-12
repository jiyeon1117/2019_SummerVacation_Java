import java.util.Scanner;


public class Game_easy {

	public static final int 가위 = 1;
	public static final int 바위 = 2;
	public static final int 보 = 3;
	
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
			//중급코스 1, 3
			switch (com) {
			case 1:
				System.out.println("컴퓨터 : 가위\t");
				break;
			case 2:
				System.out.println("컴퓨터 : 바위\t");
				break;
			case 3:
				System.out.println("컴퓨터 : 보\t");
				break;
			default:
				break;
			}
			
			switch (you) {
			case 1:
				System.out.println("컴퓨터 : 가위\t");
				break;
			case 2:
				System.out.println("컴퓨터 : 바위\t");
				break;
			case 3:
				System.out.println("컴퓨터 : 보\t");
				break;
			default:
				break;
			}
			
			if((com==가위 && you==바위) || (com==바위 && you==보) || (com==보 && you==가위)) {
				System.out.print("==> 사용자가 이겼습니다.");
			}else if(com==you) {
				System.out.println("==> 비겼습니다.");
			}else {
				System.out.println("==> 컴퓨터가 이겼습니다.");
			}
						
			System.out.println("계속하시겠습니까? (y|n) : ");
			yn = scan.next();
			if(yn.equals("n") || yn.equals("N")) break;
		}
	}

}
