import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name = "BTS";
		//System.out.println(name);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("����� �����ϴ� ��������? : ");
//		String name = sc.next();
//		System.out.println(name);

//		float height = 1.65f;
//		float weight = 52.5f;
//		float result;
//		result = weight / (height * height);
//		System.out.println("����� ü���� ������ " + result + "�Դϴ�.");
		
//		float height, weight;
//		String name;
//		
//		for (int i = 1; i<=3; i++) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("�̸� : ");
//			name = sc.next();
//			System.out.print("Ű : ");
//			height = sc.nextFloat();
//			System.out.print("������ : ");
//			weight = sc.nextFloat();
//			
//			float result = weight / (height * height); //21.9003
//			String bmi = "";
//			
//			if (result > 30.0) {
//				bmi = "��";
//			}else if (result > 25.0) {
//				bmi = "��ü��";
//			}else if (result > 20.0) {
//				bmi = "����";
//			}else {
//				bmi = "��ü��";
//			}
//			System.out.println(name +"���� " + result + "�̰�, " + bmi + "�Դϴ�.");
//		}//end of for
		
		float height, weight;
		String name;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("�̸� : ");
			name = sc.next();
			System.out.print("Ű : ");
			height = sc.nextFloat();
			System.out.print("������ : ");
			weight = sc.nextFloat();
			
			float result = weight / (height * height); //21.9003
			String bmi = "";
			
			if (result > 30.0) {
				bmi = "��";
			}else if (result > 25.0) {
				bmi = "��ü��";
			}else if (result > 20.0) {
				bmi = "����";
			}else {
				bmi = "��ü��";
			}
			System.out.println(name +"���� " + result + "�̰�, " + bmi + "�Դϴ�.");
			System.out.print("����Ͻðڽ��ϱ�? (y or n) : ");
			String choice = sc.next();
			
			if (choice.equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("�����մϴ�.");
		
//		int su = (int)result; //su = 21 (�ݿø� x) => ��������ȯ
//		
//		
//		switch (su) {
//		case 19: case 18: case 17: case 16:
//			bmi = "��ü��";
//			break;
//		case 20: case 21: case 22: case 23: case 24: case 25:
//			bmi = "����";
//			break;
//		case 26: case 27: case 28: case 29:
//			bmi = "��ü��";
//			break;	
//		default:
//			bmi = "��";
//			break;
//		}
//		System.out.println(name +"���� " + result + "�̰�, " + bmi + "�Դϴ�.");
		
	}//end of main
}//end of class
