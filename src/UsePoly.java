public class UsePoly {

    public static void main(String[] args) {

        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Are you ready?");
                System.out.println("Inside an anonymous class.");
            }
        };

        Polygon p2 = () -> {
            System.out.println("Are you ready?");
            System.out.println("Inside a lambda.");
        };
        p1.display();
        p2.display();
    }


}
