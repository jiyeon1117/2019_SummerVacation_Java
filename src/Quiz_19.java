/*
 * �Ͻ�Ʈ�ռ� ���ϱ�
 * 0~1000������ �Ͻ�Ʈ�� ���� ����ϴ� ���α׷��� �ݺ����� �̿��Ͽ� �ۼ�
 * 153 = 1��3���� + 5��3���� + 3��3������ ���� ������ �� �ڸ��� �������� ���� �ڱ� �ڽ��� �Ǵ� ��
 */
public class Quiz_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su1 = 0, su2 = 0, su3 = 0, su4 = 0, su = 0;
		for (int i=0; i<=1000; i++) {
			su1 = (i/1000)%10;
			su2 = (i/100)%10; //���� �ڸ�
			su3 = (i/10)%10;  //���� �ڸ�
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
