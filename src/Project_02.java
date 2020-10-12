import java.util.Scanner;

//음료 자판기 프로그램
public class Project_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String choice = null;
		int money, menu, pay;
		int m1000=0, m500=0, m100=0, m10=0;
		String drink = "", select = "";
		
		System.out.println("==========================================================");
		System.out.println("1. 콜라(600won) 2. 환타(550won) 3. 커피(370won) 4. 물(420won)");
		System.out.println("==========================================================");
		System.out.println();
		System.out.print("금액을 입력하세요 : ");
		money = scan.nextInt();
		
		do {
			System.out.print("음료를 선택하세요 : ");
			menu = scan.nextInt();	//menu = 1 ~ 4
			switch (menu) {
			case 1:
				pay = 600;
				select = "콜라";
				break;
			case 2:
				pay = 550;
				select = "환타";
				break;
			case 3:
				pay = 370;
				select = "커피";
				break;
			case 4:
				pay = 420;
				select = "물";
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요(1~4)");
				continue;
			}
			if(money < pay) {
				System.out.println("잔액이 부족합니다.");
				System.exit(0);
			}else {
				//money = money - pay;
				money -= pay;
				drink = drink + select + " ";
				
				m1000 = money / 1000;
				m500 = (money % 1000) / 500;
				m100 = ((money % 1000) % 500) / 100;
				m10 = (((money % 1000) % 500) % 100) / 10;
				
				System.out.println("잔액은 " + money + "입니다.");
			}
			System.out.println();
			System.out.print("추가 선택하시겠습니까?(y or n) : ");
			choice = scan.next();
		}while(choice.equals("Y") || choice.equals("y"));
		
		System.out.println("뽑으신 음료수는 : " + drink + "이며, 거스름돈은 " + money + "원 입니다.");
		System.out.printf("1000원 : %d장, 500원 : %d개, 100원 : %d개, 10원 : %d개입니다.", m1000, m500, m100, m10);
	}

}
