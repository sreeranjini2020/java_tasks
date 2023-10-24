
class CurrentBill {

    public static void main(String args[]) {
        int unit, cost;
        unit = 345;
        if (unit >= 1 && unit <= 100) {
            cost = 5;            
        } else if (unit >= 101 && unit <= 200) {
            cost = 10;
        } else if (unit >= 201 && unit <= 300) {
            cost = 15;
        } else {
            cost = 20;
        }
        System.out.print("The current bill is Rs "+ cost);
        
        
    }
    
}
