import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name = "BTS";
		//System.out.println(name);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("당신이 좋아하는 연예인은? : ");
//		String name = sc.next();
//		System.out.println(name);

//		float height = 1.65f;
//		float weight = 52.5f;
//		float result;
//		result = weight / (height * height);
//		System.out.println("당신의 체질량 지수는 " + result + "입니다.");
		
//		float height, weight;
//		String name;
//		
//		for (int i = 1; i<=3; i++) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("이름 : ");
//			name = sc.next();
//			System.out.print("키 : ");
//			height = sc.nextFloat();
//			System.out.print("몸무게 : ");
//			weight = sc.nextFloat();
//			
//			float result = weight / (height * height); //21.9003
//			String bmi = "";
//			
//			if (result > 30.0) {
//				bmi = "비만";
//			}else if (result > 25.0) {
//				bmi = "과체중";
//			}else if (result > 20.0) {
//				bmi = "정상";
//			}else {
//				bmi = "저체중";
//			}
//			System.out.println(name +"님은 " + result + "이고, " + bmi + "입니다.");
//		}//end of for
		
		float height, weight;
		String name;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("키 : ");
			height = sc.nextFloat();
			System.out.print("몸무게 : ");
			weight = sc.nextFloat();
			
			float result = weight / (height * height); //21.9003
			String bmi = "";
			
			if (result > 30.0) {
				bmi = "비만";
			}else if (result > 25.0) {
				bmi = "과체중";
			}else if (result > 20.0) {
				bmi = "정상";
			}else {
				bmi = "저체중";
			}
			System.out.println(name +"님은 " + result + "이고, " + bmi + "입니다.");
			System.out.print("계속하시겠습니까? (y or n) : ");
			String choice = sc.next();
			
			if (choice.equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("종료합니다.");
		
//		int su = (int)result; //su = 21 (반올림 x) => 강제형변환
//		
//		
//		switch (su) {
//		case 19: case 18: case 17: case 16:
//			bmi = "저체중";
//			break;
//		case 20: case 21: case 22: case 23: case 24: case 25:
//			bmi = "정상";
//			break;
//		case 26: case 27: case 28: case 29:
//			bmi = "과체중";
//			break;	
//		default:
//			bmi = "비만";
//			break;
//		}
//		System.out.println(name +"님은 " + result + "이고, " + bmi + "입니다.");
		
	}//end of main
}//end of class
