package teststuff;

public class Ques10_Tester {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validtor validtor = new Validtor();
		try {
			validtor.validStu(101);
			System.out.println("R");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("S");
		}
		finally {
			System.out.println("T");
		}
		

	}

}
