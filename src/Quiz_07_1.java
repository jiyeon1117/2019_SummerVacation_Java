//********************************
public class Quiz_07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¡§¥‰¿∫ : " + getnum());
//		System.out.println(num);
	}//end of main
	
	public static int getnum() {
		int num1 = 0;
		int num2 = 0;
		int i;
		int num = 0;
		for (i=1000; i<10000; i++) {
			num1 = i/100;
			num2 = i%100;
			if ((num1 + num2)*(num1 + num2)==i){
				num = i;
				
			}//end of if
			
		}//end of for i
		
		return num;
	}//end of getnum()
}//end of class
	
