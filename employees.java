class Employees {
    String name;
    int exp;
    String position;
    
    static void EmployeeData(int exp){
        int basicpay = 15000;
        int salary =(basicpay* exp);
        System.out.println("Employee Salary:"+salary);
    }
    
    public static void main(String args[]){
        Employees e1 = new Employees();
        e1.name ="Amy";
        e1.exp = 5;
        e1.position ="Manager";
        e1.EmployeeData(e1.exp);
        
        System.out.println("Name: " + e1.name);
        System.out.println("Age: " + e1.exp);
        System.out.println("Position: " + e1.position);
        System.out.println();
        
        Employees e2 = new Employees();
        e2.name ="Joe";
        e2.exp= 7;
        e2.position ="Sales Associate";
        e2.EmployeeData(e2.exp);
        
        System.out.println("Name: " + e2.name);
        System.out.println("Age: " + e2.exp);
        System.out.println("Position: " + e2.position);
        System.out.println();
        
        Employees e3 = new Employees();
        e3.name ="Sree";
        e3.exp = 3;
        e3.position ="QA";
        e3.EmployeeData(e3.exp);
       
        System.out.println("Name: " + e3.name);
        System.out.println("Age: " + e3.exp);
        System.out.println("Position: " + e3.position);
        
    }

    
}
