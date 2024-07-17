package teststuff;

public class Recursion_01 {
	public static int demo(int x, int y) {
		if(x == 0) {
			return 1;
		}
		else if (y > x) {
			return 0;
		}
		else {
			return(y + demo(x-1, y+1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(demo(5,1));

	}

}
