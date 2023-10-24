class LogicOperators {
    
    public static void main(String args[])
    {
        System.out.println("(10>7) and (7>6):"+(10>7 &&7>6));
        System.out.println("(10<7) and (7>6):" +(10<7 && 7>6));
        System.out.println("(10<7) or (7>6):" +(10<7 || 7>6));
        System.out.println("(15<9) or (9>3):" +(15<9 || 9>3));
        System.out.println("The result is:"+ (!(18==18)));
        System.out.println("The result is:"+ (!(7==18)));
        System.out.println("The result is:"+ (!(7!=18)));
        
    }
    
}
