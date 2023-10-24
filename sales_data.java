class Data {
    String product;
    int qtysold;
    double price;
    
    static void sales(int qtysold,double price){
        double totalsales = qtysold*price;
        System.out.println("Total sales Cost: "+totalsales);
    }
    
}
class SalesData{
    public static void main(String args[]){
        Data d1 = new Data();
        d1.product = "Pen";
        d1.qtysold = 200;
        d1.price = 9.75;
        d1.sales(d1.qtysold,d1.price);
        System.out.println("Product: "+d1.product);
        System.out.println("Quantity Sold: "+d1.qtysold);
        System.out.println("Unit Price: "+d1.price);
        System.out.println();
        
        Data d2 = new Data();
        d2.product = "Pencil";
        d2.qtysold = 150;
        d2.price = 5.50;
        d2.sales(d2.qtysold,d2.price);
        System.out.println("Product: "+d2.product);
        System.out.println("Quantity Sold: "+d2.qtysold);
        System.out.println("Unit Price: "+d2.price);
        System.out.println();
        
    
        
    }
    
}