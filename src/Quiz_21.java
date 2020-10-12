
public class Quiz_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열을 사용하여 1~9사이의 중복되지 않는 수 3개를 구하시오\
//		int c1, c2, c3;
//		c1 = (int)(Math.random() * 9) + 1;
//		
//		do {
//			c2 = (int)(Math.random() * 9) + 1;
//		}while(c1==c2);
//			
//		do {
//			c3 = (int)(Math.random() * 9) + 1;
//		}while(c3==c1 || c3==c2);
//		
//		System.out.println(c1 + " " + c2 + " " +c3);
		int ballArr[] = {1,2,3,4,5,6,7,8,9};
		int ball3[] = new int[3];
		int temp;
		//배열 ballArr[]의 임의의 index(0~8) 두개를 골라서 
		//해당 위치의 값을 서로 바꾼다
		for (int su=1; su<=20; su++) {
			int i = (int)(Math.random() * 9);
			int j = (int)(Math.random() * 9);
//			System.out.println("i=" + i + ", j=" + j);
//			ballArr[i] = ballArr[j];
//			ballArr[j] = ballArr[i];
			
			temp =  ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = temp;		
		}
		
//		for(int i=0; i<ballArr.length; i++) {
//			System.out.print(ballArr[i] + " ");
//		}
		
//		ball3[0] = ballArr[0];
//		ball3[1] = ballArr[1];
//		ball3[2] = ballArr[2];
		
//		for(int i=0; i<ball3.length; i++) {
//			ball3[i] = ballArr[i];
//		}
		
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		//System.out.println(ball3[0] + " " + ball3[1] + " " + ball3[2]);
//		for(int i=0; i<ball3.length; i++) {
//			System.out.print(ball3[i] + " ");
//		}
		
		//향상된 for문
		for(int su : ball3) {
			System.out.print(su + " ");
		}
	}

}
