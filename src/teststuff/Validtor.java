package teststuff;

public class Validtor {
	public int[] studentId = {101, 102, 103};
	
	public void validStu(int id) {
		try {
			for(int i = 0; i <= studentId.length; i++) {
				
				if(id == studentId[i]) {
					System.out.println("P");
				}
			}
		}
		finally {
			System.out.println("Q");
		}
	}
}
