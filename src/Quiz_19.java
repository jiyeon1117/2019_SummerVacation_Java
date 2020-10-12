/*
 * 암스트롱수 구하기
 * 0~1000사이의 암스트롱 수를 출력하는 프로그램을 반복문을 이용하여 작성
 * 153 = 1의3제곱 + 5의3제곱 + 3의3제곱과 같이 정수의 각 자리의 세제곱의 합이 자기 자신이 되는 수
 */
public class Quiz_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su1 = 0, su2 = 0, su3 = 0, su4 = 0, su = 0;
		for (int i=0; i<=1000; i++) {
			su1 = (i/1000)%10;
			su2 = (i/100)%10; //백의 자리
			su3 = (i/10)%10;  //십의 자리
			su4 = (i/1)%10;
//			System.out.println(su1 + " " + su2 + " " + su3 + " " + su4);
			su1 = su1*su1*su1;
			su2 = su2*su2*su2;
			su3 = su3*su3*su3;
			su4 = su4*su4*su4;
			su = su1 + su2 + su3 + su4;
			
			if(su==i) {
				System.out.println(i);
			}//end of if
		}//end of for i
	}//end of main
	
}//end of class
