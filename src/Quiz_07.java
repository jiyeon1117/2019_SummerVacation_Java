/*
 * ī����ī ���� ���ϴ� ���α׷��� for���� �̿��ؼ� �ۼ��Ͻÿ�
 * ���� ��� �� �ڸ� ���� 2025�� ����� ���󺸸� 20�� 25 �� ���� ���ڰ� �����
 * �� �ΰ��� ���ڸ� ���ϸ� 45�̰�, 45�� �����ϸ� ó���� 2025�� �ȴ�
 * �̷��� ������ ���� ���� ī����ī ����� �Ѵ�
 * ���� 81�� ��� ���ڸ� ���󺸸� 8�� 1�� �������� ���ϸ� 9�� �ǰ� �ٽ� �����ϸ� 81�� �ȴ�
 * ���� 81�� ���ڸ� ������ ī����ī ���� �ȴ�
 * ���ڸ� ī����ī ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
				System.out.println("������ : " + i);
			}//end of if
		}//end of for i
	
	}//end of main

}//end of class
