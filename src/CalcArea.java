
public class CalcArea {

	public static void main(String[] args) {
		
		//create anon inner class
		Area area = new Area() {
			public double rectangleArea(double x, double y) {
				return x * y;
			}
			
			public double circleArea(double x) {
				return Math.PI * x * x;
			}
		};
		
		//use inner class
		System.out.println(area.circleArea(22));
		System.out.println(area.rectangleArea(11.3, 12.2));
		
	}

}
