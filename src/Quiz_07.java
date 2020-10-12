/*
 * 카프리카 수를 구하는 프로그램을 for문을 이용해서 작성하시오
 * 예를 등어 네 자리 숫자 2025의 가운데를 갈라보면 20과 25 두 개의 숫자가 생긴다
 * 이 두개의 숫자를 더하면 45이고, 45를 제곱하면 처음의 2025가 된다
 * 이러한 성질을 갖는 수를 카프리카 수라고 한다
 * 또한 81은 가운데 숫자를 갈라보면 8과 1로 갈라지고 더하면 9가 되고 다시 제곱하면 81이 된다
 * 따라서 81은 두자리 숫자의 카프리카 수가 된다
 * 네자리 카프리카 수를 구하는 프로그램을 작성하시오.
 */
public class Quiz_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		for (int i=1000; i<10000; i++) {
			num1 = i/100;
			num2 = i%100;
//			System.out.println(num1 +" " + num2);
			if ((num1 + num2)*(num1 + num2)==i){
				System.out.println("정답은 : " + i);
			}//end of if
		}//end of for i
	
	}//end of main

}//end of class
