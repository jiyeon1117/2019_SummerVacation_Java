
public class Quiz_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		for (int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				sum += i;
				count++;
			}//end of if
		}//end of for i
		System.out.println("ÃÑÇÕ : " + sum + " °¹¼ö : " + count);
	}//end of main
}//end of class
