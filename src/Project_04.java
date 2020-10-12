//로또 당첨확률
public class Project_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 100000;			//1000회 * 1000원 = 1,000,000원
		int lotto[] = new int[7];	//이번주 당첨 번호
		int human[] = new int[6];	//사용자 선택 번호
		int lucky;					//맞힌 숫자의 갯수 lucky = 6 ==> 1등
		int lucky_b;				//lucky_b = 1, 보너스 O / lucky_b = 0, 보너스 X
		int rank1=0, rank2=0, rank3=0, rank4=0, rank5=0;
		
		for(int i=0; i<7; i++) {	//로또 당첨 번호 추출
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}//end of if
			}//end of for j
		}//end of for i
		
		for(int k=1; k<=count; k++) {
			System.out.printf("[제 %5d 회]", k);
			for(int i=0; i< 6; i++) {
				System.out.printf("%2d ", lotto[i]);	
			}
			System.out.printf("[%2d]\t", lotto[6]);
			
			for(int i=0; i<6; i++) {	//로또 당첨 번호 추출
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
				System.out.println(" ** 1등 **");
				rank1++;
				break;
			case 5:
				if(lucky_b==1) {
					System.out.println(" [ 2등 ] ");
					rank2++;
					break;
				}else {
					System.out.println(" [ 3등 ] ");
					rank3++;
					break;
				}
			case 4:
				System.out.println(" [ 4등 ] ");
				rank4++;
				break;
			case 3:
				System.out.println(" [ 3등 ] ");
				rank5++;
				break;
			default:
				System.out.println(" * 꽝 * ");
				break;
			}
		}//end of for k
		System.out.println();
		System.out.println("총 도전 횟수 : " + count + "회");
		System.out.println("1등 : " + rank1 + "회");
		System.out.println("2등 : " + rank2 + "회");
		System.out.println("3등 : " + rank3 + "회");
		System.out.println("4등 : " + rank4 + "회");
		System.out.println("5등 : " + rank5 + "회");
		
		
		
		//중간 값 확인
//		for(int k=0; k<7; k++) {
//			System.out.print(lotto[k] + " ");
//		}
		
	}//end of main
}//end of class
