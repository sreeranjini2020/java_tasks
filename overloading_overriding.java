
class PerimeterofShapes {

    public void perimeter(int length, int width) {
        double rectangleperimeter = 2 * (length + width);
        System.out.println("rectangleperimeter " + rectangleperimeter);
    }

    public void perimeter(int side) {
        double squareperimeter = 4 * side;
        System.out.println("squareperimeter " + squareperimeter);
    }
}

class Shapes extends PerimeterofShapes {

    public void perimeter(double radius) {
        double circleperimeter = 2 * Math.PI * radius;
        System.out.println("circleperimeter " + circleperimeter);
    }

}

class OverloadingAndOverriding {

    public static void main(String args[]) {
        PerimeterofShapes p = new PerimeterofShapes();
        p.perimeter(7, 8);
        p.perimeter(90);

        Shapes s = new Shapes();
        s.perimeter(6.8);
    }

}
