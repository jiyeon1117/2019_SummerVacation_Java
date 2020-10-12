
public class Quiz_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문을 이용해서 누적합계가 100이 넘는 수 출력
		int i = 0;
		int sum = 0;

		while(sum<=100) {
			sum += ++i;
		}//end of while
		System.out.println("누적합계가 100이 넘는 수 : " + i);
		System.out.println("합계 : " + sum);
		
	}//end of main
}//end of class

//		while(i<101) {
////			System.out.println(i);
//			i++; // i = i + 1;
//			sum += i; //sum = sum + i
//			if(sum>10000) {
//				break;
//			}
//		}//end of while
//		System.out.println("누적합계가 100이 넘는 수 : " + i);
//		System.out.println("합계 : " + sum);