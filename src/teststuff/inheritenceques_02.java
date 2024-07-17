package teststuff;
class hello{
	public int count;
	
	public hello() {
		count = 10;
	}
	public int method1() {
		int count  = 20;
		return this.count;
	}
}
class B1 extends hello{
	
	public int method1(int value1) {
		return this.count = 15;
	}
	public int method1() {
		return 20;
	}
	
}
class hey extends B1{
	
	public int method2() {
		return 40;
	}
}
public class inheritenceques_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello obj1 = new hello();
		B1 obj2 = new B1();
		hey obj3 = new hey();
		System.out.println(obj1.method1() + obj3.method1()+ obj3.method2());
		
	}

}
