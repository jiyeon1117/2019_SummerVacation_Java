import java.util.Scanner;

public class Project_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String strArr[] = {"android", "iamyourfather", "overwatch", "battleground", "iloveyou"};
		
		
		while(true) {
			String answer = getAnswer(strArr);
			String questing = getScrambledWord(answer);
			char hint[] = new char[answer.length()];
			//hint 배열을 '_'로 초기화
			
			for(int i=0; i<hint.length; i++) {
				hint[i] = '_';
			}
			
			
			while (true) {
				System.out.println("문제 : " + questing);
				System.out.print("정답 (q:종료) : ");
				String input = scan.next();
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if(input.equalsIgnoreCase(answer)) {
					System.out.println("정답입니다.");
					System.out.println();
					break;
				}else {
					System.out.println(input + "은(는) 정답이 아닙니다.");
					System.out.println("힌트 : " + getHint(answer, hint));
					System.out.println();
				}
			}
			
		}
				
	}//end of main
	
	public static String getAnswer(String strArr[]) {
		int index = (int)(Math.random() * strArr.length);
		return strArr[index]; 	
	}//end of getAnswer
	
	public static String getScrambledWord(String str) {
		char chArr[] = str.toCharArray();
		for(int i=1; i<=15; i++) {
			int index = (int)(Math.random() * chArr.length);
			char temp = chArr[0];
			chArr[0] = chArr[index];
			chArr[index] = temp;
		}
		
		return new String(chArr);
	}
	
	public static String getHint(String answer, char hint[]) {
		//1.hint[] 포함된 '_' 개수를 샌다
		//2.count의 값이 2보다 클 때에만 정답의 한 글자를 hint 배열에 넣는다
		//3.정답을 다 알려주는 상황이 되지 않기 위해서 함.
		//4 [주의] 반드시 이전 힌트보다 한 글자를 더 보여줘야 함.
		//5. Math.random()메서드를 사용해서 answer에서 한글자를 hint배열에 넣어줘야 함
		
		int count = 0;
		for(int i=0; i<hint.length; i++) {
			if(hint[i]=='_') {
				count++;
			}
		}
		if(count>2) {
			while (true) {
				int idx = (int)(Math.random() * answer.length());
				if(hint[idx]=='_') {
					hint[idx] = answer.charAt(idx);
					break;
				}
			}
		}
		
		return new String(hint);
	}
}//end of class
