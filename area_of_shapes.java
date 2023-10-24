
class ShapesusingOverloading {

    public void area(int length, int width) {
        int rectangleArea = length * width;
        System.out.println("Rectangle Area: " + rectangleArea);
    }

    public void area(int radius) {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Circle Area: " + circleArea);
    }

    public void area(double base, double height) {
        double triangleArea = 0.5 * base * height;
        System.out.println("Triangle Area: " + triangleArea);
    }

    public void area(double side) {
        double squareArea = 6 * side;
        System.out.println("Square Area:" + squareArea);
    }
}

class AreaofShapes {

    public static void main(String args[]) {
        ShapesusingOverloading s = new ShapesusingOverloading();
        s.area(45);
        s.area(23, 56);
        s.area(3.5, 4.5);
        s.area(34.6);
    }

}
