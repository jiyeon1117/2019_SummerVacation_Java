/*
 * �� ���� �ֻ����� ������ �� ���� 6�� �Ǵ� ��� ����� �� ���
 * for��
 */
public class Quiz_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=6; j++) {
				if ((i+j)==6) {
					count++;
					System.out.println(i + " " + j);
				}//end of if
			}//end of for j
		}//end of for i
		System.out.println("�� " + count + "ȸ�Դϴ�.");
	}//end of main
}//end of class
