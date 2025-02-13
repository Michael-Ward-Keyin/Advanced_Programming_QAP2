public class TestMyRectangle {
    public static void main(String[] args) {
        // Creating MyPoint objects
        MyPoint topLeft = new MyPoint(2, 8);
        MyPoint bottomRight = new MyPoint(6, 3);

        // Creating MyRectangle
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        // Print rectangle
        System.out.println("Rectangle: " + rectangle);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perameter: " + rectangle.getPerameter());

    }
}