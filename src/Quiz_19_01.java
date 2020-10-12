
public class Quiz_19_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//¾Ï½ºÆ®·Õ ¼ö¸¦ ±¸ÇÏ½Ã¿À
		int i, sum, temp, rem;
		int count = 0;
		for(i=0; i<=1000; i++) {
			sum = 0;
			temp = i;
			while(temp!=0) { //temp = 153
				rem = temp%10 ; //rem = 3;
				sum += (rem*rem*rem); //3ÀÇ 3Á¦°ö + 5ÀÇ 3Á¦°ö + 1ÀÇ 3Á¦°ö
				temp /= 10;
			}
			
			if(i==sum) {
				count++;
				System.out.println(i + " ");
			}
		}
		System.out.println();
		System.out.println("¾Ï½ºÆ®·Õ¼ö´Â ÃÑ " + count +"°³ ÀÔ´Ï´Ù.");
	}

}
