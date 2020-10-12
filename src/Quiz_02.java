/* 철수와 영희는 사과를 가지고 있다.
 * 철수가 영희에게 사과를 한 개 주면 둘이 가지고 있는 사과의 개수가 같아지고 
 * 영희가 철수에게 사과를 한 개 주면 철수는 영희의 사과 개수의 배가 된다 
 * 철수와 영희는 각각 몇 개의 사과를 가지고 있는가 
 * 이중 for 문을 이용하여 작성하시오 
 * 총 사과의 개수는 100개 이하이다.
 */
public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 1;
//		int b = 1;
//		for (int i = 1; i<=100; i++) {
//			for (int j = 1; j<=100; j++) {
//				if (i == j+1) {
//					i = j;
//				}else if (j == i+1) {
//					i = j*2;
//				}
//				b = j;
//			}
//			a = i;
//		}
//		System.out.println("철수 : " + a + "개, " + "영희 : " + b + "개");
		
		int 철수, 영희;
		
		for (철수 = 1; 철수<=100; 철수++) {
			for (영희 = 1; 영희<=100; 영희++) {
				if((철수-1 == 영희+1) && (영희-1)*2 == 철수+1) {
					System.out.println("철수 : " + 철수 + "개, " + "영희 : " + 영희 + "개");
				}//end of if

			}//end of for 영희
		}//end of for 철수
	
	}//end of main
}//end of class