import java.util.Scanner;

//이상형 월드컵 ==> 배열을 이용
public class Project_03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법3 : 배열 및 반복문을 한 번만 사용하기
		String one[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
		Scanner scan = new Scanner(System.in);
		int choice;
		int len = one.length;
		
		for(int i=0; i<3; i++) {
			for(int j=0, x=0; j<len; j+=2, x++) {
				System.out.println((j+1) + "번 " + one[j] + "\t" + (j+2) + "번 " + one[j+1]);
				choice = scan.nextInt(); 
				if(choice==(j+1) || choice==(j+2)) {
					one[x] = one[choice-1];
				}else {
					System.out.println("잘못 입력하셨습니다. " + (j+1) + "또는" + (j+2) + "만 입력해주세요.");
					j -= 2;
					continue;
				}
				
			}for(int k=0; k<one.length; k++) {
					System.out.print(one[k] + "\t");
				}
				System.out.println();
				len = len / 2;
		}
			
		System.out.println();		
		System.out.println("당신의 최종 선택은 " + one[0] + "입니다");
		
	}

}
