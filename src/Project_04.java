//�ζ� ��÷Ȯ��
public class Project_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 100000;			//1000ȸ * 1000�� = 1,000,000��
		int lotto[] = new int[7];	//�̹��� ��÷ ��ȣ
		int human[] = new int[6];	//����� ���� ��ȣ
		int lucky;					//���� ������ ���� lucky = 6 ==> 1��
		int lucky_b;				//lucky_b = 1, ���ʽ� O / lucky_b = 0, ���ʽ� X
		int rank1=0, rank2=0, rank3=0, rank4=0, rank5=0;
		
		for(int i=0; i<7; i++) {	//�ζ� ��÷ ��ȣ ����
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}//end of if
			}//end of for j
		}//end of for i
		
		for(int k=1; k<=count; k++) {
			System.out.printf("[�� %5d ȸ]", k);
			for(int i=0; i< 6; i++) {
				System.out.printf("%2d ", lotto[i]);	
			}
			System.out.printf("[%2d]\t", lotto[6]);
			
			for(int i=0; i<6; i++) {	//�ζ� ��÷ ��ȣ ����
				human[i] = (int)(Math.random() * 45) + 1;
				for(int j=0; j<i; j++) {
					if(human[i]==human[j]) {
						i--;
						break;
					}//end of if
				}//end of for j
			}//end of for i
			
			lucky = 0;
			for(int i=0; i<6; i++) {
				for(int j=0; j<6; j++) {
					if(human[i]==lotto[j]) {
						System.out.printf("%2d ", human[i]);
						lucky++;
						break;
					}else if(human[i]!=lotto[j] && j==5) {
						System.out.printf("%2d ", human[i]);
					}
				}
			}
			int i1;
			for(i1=0, lucky_b=0; i1<6; i1++) {
				if(lotto[6]==human[i1]) {
					lucky_b = 1;
					break;
				}
			}
			switch (lucky) {
			case 6:
				System.out.println(" ** 1�� **");
				rank1++;
				break;
			case 5:
				if(lucky_b==1) {
					System.out.println(" [ 2�� ] ");
					rank2++;
					break;
				}else {
					System.out.println(" [ 3�� ] ");
					rank3++;
					break;
				}
			case 4:
				System.out.println(" [ 4�� ] ");
				rank4++;
				break;
			case 3:
				System.out.println(" [ 3�� ] ");
				rank5++;
				break;
			default:
				System.out.println(" * �� * ");
				break;
			}
		}//end of for k
		System.out.println();
		System.out.println("�� ���� Ƚ�� : " + count + "ȸ");
		System.out.println("1�� : " + rank1 + "ȸ");
		System.out.println("2�� : " + rank2 + "ȸ");
		System.out.println("3�� : " + rank3 + "ȸ");
		System.out.println("4�� : " + rank4 + "ȸ");
		System.out.println("5�� : " + rank5 + "ȸ");
		
		
		
		//�߰� �� Ȯ��
//		for(int k=0; k<7; k++) {
//			System.out.print(lotto[k] + " ");
//		}
		
	}//end of main
}//end of class
