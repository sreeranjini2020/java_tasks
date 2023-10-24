class detailsFunction {
    static void data(String name, int age, String gender, String address){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }
        
    
    public static void main(String args[]){
        data("Ann",25,"Female", "44 St Johns,CA");
        data("Emy", 22,"Female", "23 London, UK");
        data("Tia", 21,"Female", "54 JBR,UAE");
        data("Ben", 34, "Male", "78 Goa, India");
               
    }
        
}
