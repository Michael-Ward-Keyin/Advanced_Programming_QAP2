public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        MyLine line1 = new MyLine(p1, p2);
        MyLine line2 = new MyLine(3, 5, 8, 10);

        System.out.println("Line 1: " + line1);
        System.out.println("Line 2: " + line2);

        System.out.println("Line 1 length: " + line1.getLength());
        System.out.println("Line 1 gradient: " + Math.toDegrees(line1.getGradient()));

        System.out.println("Line 2 length: " + line2.getLength());
        System.out.println("Line 2 gradient: " + Math.toDegrees(line2.getGradient()));
        
        line1.setEndXY(10, 15);
        System.out.println("Updated Line 1: " + line1);

    }
}