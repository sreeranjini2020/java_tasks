class reusableblockFunction {
    static void add(int x, int y ,int z){
        int w = x+y+z;
        System.out.println("Sum: "+w);
    }
    static void sub(int x, int y ,int z) {
        int u = x-y-z;
        System.out.println("Difference: "+u);
        
    }
    static void mul(int x, int y ,int z){
        int v = x*y*z;
        System.out.println("Product: "+ v);
    }
    
    static void div(int x, int y ,int z){
        int s = x/y/z;
        System.out.println("Quotient: "+ s);
    }
    public static void main(String args[]){
        add(24, 4, 2);
        sub(24, 4, 2);
        mul(24, 4, 2);
        div(24, 4, 2);
                
        
    }
    
}
