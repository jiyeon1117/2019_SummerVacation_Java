import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com, you, y=1, n=0;
		int num=0;
		String an, rock;
		Scanner scan = new Scanner(System.in);
		
		
		do {
			num++;
			com = (int)(Math.random() * 3) + 1;
//			System.out.println(com);
			System.out.print("(1: 가위 , 2: 바위 3: 보) : ");
			you = scan.nextInt();
			
			if(com==1 && you==1) {
				System.out.println("컴퓨터 : 가위, 사용자 : 가위  ==> 비겼습니다");
			}
			else if(com==2 && you==2) {
				System.out.println("컴퓨터 : 바위, 사용자 : 바위  ==> 비겼습니다");
			}
			else if(com==3 && you==3) {
				System.out.println("컴퓨터 : 보, 사용자 : 보  ==> 비겼습니다");
			}
			else if(com==1 && you==2) {
				System.out.println("컴퓨터 : 가위, 사용자 : 바위  ==> 사용자가 이겼습니다");
			}
			else if(com==1 && you==3) {
				System.out.println("컴퓨터 : 가위, 사용자 : 보  ==> 컴퓨터가 이겼습니다");
			}
			else if(com==2 && you==1) {
				System.out.println("컴퓨터 : 바위, 사용자 : 가위  ==> 컴퓨터가 이겼습니다");
			}
			else if(com==2 && you==3) {
				System.out.println("컴퓨터 : 바위, 사용자 : 보  ==> 사용자가 이겼습니다");
			}
			else if(com==3 && you==1) {
				System.out.println("컴퓨터 : 보, 사용자 : 가위  ==> 사용자가 이겼습니다");
			}
			else if(com==3 && you==2) {
				System.out.println("컴퓨터 : 보, 사용자 : 바위  ==> 컴퓨터가 이겼습니다");
			}
			System.out.print("계속하시겠습니까(y|n)? : ");
			an = scan.next();
			if(an.equals("y")) {
				continue;
			}
			else {
				break;
			}
		}while(true);
	}

}
