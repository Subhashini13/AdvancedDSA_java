package teststuff;

class Parent{
	public final void dM() {
		System.out.println("hi P");
	}
	
}
class Child extends Parent{
//	public void dM() {
//		System.out.println("hi child");
//	}
	
}
public class TestParent {

	public static void main(String[] args) {
		Parent p = new Child();
		p.dM();
	}

}
