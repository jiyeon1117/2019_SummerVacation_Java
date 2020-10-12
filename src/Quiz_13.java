/* 
 * while 문을 이용해서 -1 3 -5 7 -9 11 -13
 */
public class Quiz_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int count = 1;
		int sum = 0;
		
		while(num<100) {
//			System.out.println("num = " + num + ", count = " + count );
			if(count%2==0) {
				sum += num;
				System.out.print(num + " ");
			}else {
				sum -= num;
				System.out.print("-" + num + " ");
			}//end of if
			count++;
			num+=2;
		}//end of while
		System.out.println();
		System.out.println("총 합 : " + sum);
		
	}//end of main
}//end of class
