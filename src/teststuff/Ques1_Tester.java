package teststuff;

public class Ques1_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=2, num2= 20;
		do {
			num2 = num2 / num1;
			if(num1 > num2) {
				break;
			}
			num2--;
			
		}
		while(++num1 < 5);
		System.out.println(num1 + "" + num2);
		}

}
