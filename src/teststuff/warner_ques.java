package teststuff;

public class warner_ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i1="warner";
		String i2 = new String("WARNER");
		i2.toLowerCase();
		if(i1 == i2) {
			System.out.println("Welcome "  +i1);
		}
		else if(i1.equals(i2)) {
			System.out.println("Welcome " + i2);
		}
		else {
			System.out.println("Welcome");
		}
	}

}
