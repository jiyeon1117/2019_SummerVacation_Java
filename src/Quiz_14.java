
public class Quiz_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while���� �̿��ؼ� �����հ谡 100�� �Ѵ� �� ���
		int i = 0;
		int sum = 0;

		while(sum<=100) {
			sum += ++i;
		}//end of while
		System.out.println("�����հ谡 100�� �Ѵ� �� : " + i);
		System.out.println("�հ� : " + sum);
		
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
//		System.out.println("�����հ谡 100�� �Ѵ� �� : " + i);
//		System.out.println("�հ� : " + sum);