public class RectangleDemo {
public static void main(String[] args) {
    //class_name obj_name = new class_name();
    Rectangle r1 = new Rectangle();
    
    //obj_name.method_name();
    r1.setLength(10);
    r1.setWidth(5);

    System.out.println("Length: " + r1.getLength());
    System.out.println("Width: " + r1.getWidth());
    System.out.println("Area: " + r1.getArea());
 }
}