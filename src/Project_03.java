import java.util.Scanner;

//이상형 월드컵 ==> 배열을 이용
public class Project_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법1 : 새로운 배열을 생성
		String one[] = {"짜장면", "짬뽕", "후라이드치킨", "양념치킨", "비빔냉면", "물냉면", "간장게장", "양념게장"};
		String two[] = new String[4];
		String three[] = new String[2];
		String result = null;
		
		int c = 0, d = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("*** 이상형 월드컵 - 당신의 선택은 ? ***");
		System.out.println();
		
		for(int i=0; i<one.length; i+=2) {
			System.out.println("1번 " + one[i] + "\t" + "2번 " + one[i+1]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				two[c] = one[i];
			}else if(choice==2){
				two[c] = one[i];
			}else {
				System.out.println("1 또는 2만 입력해주세요.");
				System.out.println();
				i -= 2;
				continue;
			}
			c++;
		}
		System.out.println();
		
		for(int i=0; i<two.length; i+=2) {
			System.out.println("1번 " + two[i] + "\t" + "2번 " + two[i+1]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				three[d] = two[i];
			}else if(choice==2){
				three[d] = two[i];
			}else {
				System.out.println("1 또는 2만 입력해주세요.");
				System.out.println();
				i -= 2;
				continue;
			}
			d++;
		}
		System.out.println();
		
		for(int i=0; i<three.length; i+=2) {
			System.out.println("1번 " + three[i] + "\t" + "2번 " + three[i+1]);
			System.out.print("==> ");
			int choice = scan.nextInt();	//choice = 1, 2
			
			if(choice==1) {
				result = three[i];
			}else if(choice==2){
				result = three[i];
			}else {
				System.out.println("1 또는 2만 입력해주세요.");
				System.out.println();
				i -= 2;
				continue;
			}
		}
		System.out.println();
		
//		for(int i=0; i<two.length; i++) {
//			System.out.println(two[i] + "\t");
//		}
//		System.out.println();
//		
//		for(int i=0; i<two.length; i++) {
//			System.out.println(three[i] + "\t");
//		}
		System.out.println();
		
		System.out.println("당신의 최종 선택은 " + result + "입니다");
		
	}

}
