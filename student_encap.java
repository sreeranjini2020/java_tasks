class Encap {
    private int fee = 10;
    private int std = 12;
    String name = "Amy";
    int number = 32;

    void display(){
        System.out.println("Hello from Encap class");
        System.out.println(name);
        System.out.println(number);}
    
    void donation(){
        int don = fee* std;
        System.out.println(don);
    }
        
}
class StudenEncap{
    public static void main(String args[]){
        Encap a = new Encap();
        a.name = "Joe";
        a.number = 45;
        a.display();
        a.donation();
    }
}