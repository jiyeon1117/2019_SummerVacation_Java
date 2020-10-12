import java.util.Scanner;
//3 6 9 game
public class Project_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세요 : ");
		int su = scan.nextInt();
		int len;	//len = 길이
		
		for(int i=1; i<=su; i++) {
			len = length(i);
			int count369 = number369(i, len);
//			System.out.println(i + " " + len + " " + count369);
			
			if(count369>0) {
				for (int j=1; j<=count369; j++) {
					System.out.print("짝");
				}
			}else {
				if(i%10==0) {
					System.out.print("만세");
				}
				else {
					System.out.print(i);
				}
			}System.out.println();
		}//end of for i
		
		
		
	}//end of main
	public static int length(int num) {	//num = 1
				
		return Integer.toString(num).length();	//"1"
	}//end of Length
	
	public static int number369(int su, int len) {
		int a = su;
		int count = 0;
		
		for(int i=0; i<len; i++) {
			if((a%10!=0) && (a%10)%3==0) {
				count++;
			}
			a = a / 10;
		}
		return count;
	}
	
	
	
}//end of class
