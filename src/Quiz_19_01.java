
public class Quiz_19_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ͻ�Ʈ�� ���� ���Ͻÿ�
		int i, sum, temp, rem;
		int count = 0;
		for(i=0; i<=1000; i++) {
			sum = 0;
			temp = i;
			while(temp!=0) { //temp = 153
				rem = temp%10 ; //rem = 3;
				sum += (rem*rem*rem); //3�� 3���� + 5�� 3���� + 1�� 3����
				temp /= 10;
			}
			
			if(i==sum) {
				count++;
				System.out.println(i + " ");
			}
		}
		System.out.println();
		System.out.println("�Ͻ�Ʈ�ռ��� �� " + count +"�� �Դϴ�.");
	}

}
