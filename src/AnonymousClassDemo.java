/* Notice the use of 2 anonymous classes.
   Each has a different behavior but the same name.  
   The name of the interface is used since both objects satisfy the interface.
   
   Comment toString() out in one of the anonymous classes and see what happens?
   What class is parent to the inner classes?
   */

public class AnonymousClassDemo {
	
	
	public static void main(String[] args) {
		
		//------------------------------------------------------
		NumberCarrier anObject = new NumberCarrier() {
			
			private int number;

			public void setNumber(int value) {
				number = value;
			}

			public int getNumber() {
				return number;
			}
			
			public String toString(){
				return Integer.toString(number);
			}

		};
		
		//-------------------------------------------------------
		NumberCarrier anotherObject = new NumberCarrier() {
			
			private int number;

			public void setNumber(int value) {
				number = 2 * value;
			}

			public int getNumber() {
				return number;
			}

			public String toString(){
				return Integer.toString(number);
			}
		};
		
		//--------------------------------------------------------

		anObject.setNumber(42);
		anotherObject.setNumber(42);
		System.out.println(anObject);
		System.out.println(anotherObject);
		System.out.println("End of program.");
	}//end main

	
}
