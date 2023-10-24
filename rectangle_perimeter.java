
class RectanglePerimeter {
    static int calperi(int l, int b){
        int perimeter = 2*l*b;
        return perimeter;
    }
    public static void main(String args[]){
        int P = calperi(10,6);
        System.out.println("The perimeter of the rectangele  "+P);
    }
}
