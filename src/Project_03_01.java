import java.util.Scanner;

//이상형 월드컵 ==> 배열을 이용
public class Project_03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법2 : 하나의 배열만 사용
		String one[] = {"짜장면", "짬뽕", "후라이드치킨", "양념치킨", "비빔냉면", "물냉면", "간장게장", "양념게장"};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** 이상형 월드컵 - 당신의 선택은 ? ***");
		System.out.println();
		
		for(int i=0; i<one.length; i+=2) {
			System.out.println("1번 " + one[i] + "\t" + "2번 " + one[i+1]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				one[i+1] = one[i];
			}else if(choice==2){
				one[i] = one[i+1];
			}else {
				System.out.println("1 또는 2만 입력해주세요.");
				System.out.println();
				i -= 2;
				continue;
			}
		}
		System.out.println();
		
		for(int i=0; i<one.length; i+=4) {
			System.out.println("1번 " + one[i] + "\t" + "2번 " + one[i+2]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				one[i] = one[1];
			}else if(choice==2){
				one[i] = one[i+2];
			}else {
				System.out.println("1 또는 2만 입력해주세요.");
				System.out.println();
				i -= 4;
				continue;
			}
		}
		System.out.println();
		
		for(int i=0; i<one.length/2; i+=4) {
			System.out.println("1번 " + one[i] + "\t" + "2번 " + one[i+4]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				one[i] = one[1];
			}else if(choice==2){
				one[i] = one[i+4];
			}else {
				System.out.println("1 또는 2만 입력해주세요.");
				System.out.println();
				i -= 2;
				continue;
			}
		}
		System.out.println();
		
		System.out.println("당신의 최종 선택은 " + one[0] + "입니다");
		
	}

}
