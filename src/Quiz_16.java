/* 
 * 1116 2556 2880ó�� ���� �ڸ��� ���� �ڸ��� ���� 4�ڸ� ���� �߿���
 * 9�� ����� ��� ����ϰ� �� ������ ��� ���
 * �� ��� ���� �� �ٿ� 10���� ���
 */
public class Quiz_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int count = 0;
		
		for (int i=1000; i<=9999; i++) {
			int h = (i/100) % 10; //���� �ڸ�
			int t = (i/10) % 10;  //���� �ڸ�
			
			if(i%9==0 && h==t) {
				count++;
				System.out.println(i + " ");
				if(count%10==0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("�� ���� = " + count);
		
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
//					System.out.println("���� : " + num1 + " " + num2);
//				}
//			}
//		}
//		System.out.println("���� : " + count);