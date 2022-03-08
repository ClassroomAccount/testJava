//inner class demo
//object of outer class necessary to create object of inner class
public class FirstInnerClassDemo {
	
	public class inner{
		
		public inner() {
			System.out.println("Instance of inner class created");
		}
	}

	public static void main(String[] args) {
		
		FirstInnerClassDemo outer = new FirstInnerClassDemo();
		inner inn = outer.new inner();

		System.out.println("We did it!");
	}

}
