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
			//hint �迭�� '_'�� �ʱ�ȭ
			
			for(int i=0; i<hint.length; i++) {
				hint[i] = '_';
			}
			
			
			while (true) {
				System.out.println("���� : " + questing);
				System.out.print("���� (q:����) : ");
				String input = scan.next();
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if(input.equalsIgnoreCase(answer)) {
					System.out.println("�����Դϴ�.");
					System.out.println();
					break;
				}else {
					System.out.println(input + "��(��) ������ �ƴմϴ�.");
					System.out.println("��Ʈ : " + getHint(answer, hint));
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
		//1.hint[] ���Ե� '_' ������ ����
		//2.count�� ���� 2���� Ŭ ������ ������ �� ���ڸ� hint �迭�� �ִ´�
		//3.������ �� �˷��ִ� ��Ȳ�� ���� �ʱ� ���ؼ� ��.
		//4 [����] �ݵ�� ���� ��Ʈ���� �� ���ڸ� �� ������� ��.
		//5. Math.random()�޼��带 ����ؼ� answer���� �ѱ��ڸ� hint�迭�� �־���� ��
		
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
