/* 100�̸��� ���ӵ� �� �ڸ����� ¦�� 3���� ���Ͽ����� 4****2�� �Ǿ���
 * �� ������ ���� � ������ �׸��� ����� ������ ���ϴ� ���α׷��� for���� �̿��Ͽ� �ۼ�
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
