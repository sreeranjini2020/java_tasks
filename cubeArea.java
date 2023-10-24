class cubeArea {
    static int calarea(int side){
        int area = 6*side*side;
        return area;
    }
    public static void main(String args[]){
        int A =calarea(6);
        System.out.println("The area of the cube with side length " + A);
        
    }
}
    
