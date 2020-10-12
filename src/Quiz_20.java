
public class Quiz_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {79, 88, 91, 33, 100, 55, 95, 48, 69, 88};
		int max = score[0];
		int min = score[0];
		
		for(int i=0; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			
			if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}//end of main
}//end of class
