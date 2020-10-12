import java.util.Scanner;

public class Game_easy_01 {

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
			//중급코스 2
			System.out.println("컴퓨터 : " + print(com));
			System.out.println("사용자 : " + print(you));
			
			if((com==1 && you==2) || (com==2 && you==3) || (com==3 && you==1)) {
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
	}//end of main
	
	public static String print(int su) {
		String result;
		
		if(su==1) {
			result = "가위\t";
		}else if(su==2) {
			result = "바위\t";
		}else if(su==3) {
			result = "보\t";
		}else {
			result ="1~3 사이의 숫자만 입력해주세요. \t";
		}
		
		return result;
	}

}
