/* 100미만의 연속된 두 자릿수의 짝수 3개를 곱하였더니 4****2가 되었다
 * 이 세개의 수는 어떤 수인지 그리고 결과는 얼마인지 구하는 프로그램을 for문을 이용하여 작성
 * 
 */
public class Quiz_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		for (int su=10; su<100; su+=2) {
			num = su * (su+2) * (su+4);
			//System.out.println(num);
			if (num/100000==4 && num%10==2) {
				System.out.println(su + " " + (su+2) + " " + (su+4) + " = " + num);
			}//end of if
		}//end of for
		
	}//end of main
}//end of class
