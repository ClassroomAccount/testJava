//balloon is inner class for conciseness of program

public class BuyBalloon {

	//inner class balloon
	public class balloon {

		private String color;
		private double size;
		private double price;
		
		public balloon(String color, double size, double price) {
			super();
			this.color = color;
			this.size = size;
			this.price = price;
		}		
		
		public String toString() {
			return this.color + " " + this.size + " " + this.price;
		}
	}
	//end inner class -----------------------------------
	
	public static void main(String[] args) {
		
		BuyBalloon buy = new BuyBalloon();
		
		balloon one = buy.new balloon("red", 12.1, 3.99);
		balloon two = buy.new balloon("Green", 11.3, 4.99);
		
		System.out.println(one);
		System.out.println(two);
		
		System.out.println("Successful buy");
				
	}

}
