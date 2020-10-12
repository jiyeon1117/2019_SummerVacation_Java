/* 
 * 1116 2556 2880처럼 백의 자리와 십의 자리가 같은 4자리 숫자 중에서
 * 9의 배수를 모두 출력하고 그 개수도 세어서 출력
 * 단 결과 값은 한 줄에 10개씩 출력
 */
public class Quiz_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int count = 0;
		
		for (int i=1000; i<=9999; i++) {
			int h = (i/100) % 10; //백의 자리
			int t = (i/10) % 10;  //십의 자리
			
			if(i%9==0 && h==t) {
				count++;
				System.out.println(i + " ");
				if(count%10==0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("총 갯수 = " + count);
		
	}//end of main
}//end of class



//		int num1=0, num2=0;
//		int count=0;
//		for (int i=1000; i<=9999; i++) {
//			num1 = i/100;
//			num2 = i%100;
//			if (num2>=10) {
//				if(num1%9==0 && num2%9==0) {
//					count++;
//					System.out.println("정답 : " + num1 + " " + num2);
//				}
//			}
//		}
//		System.out.println("갯수 : " + count);