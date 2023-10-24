class MaxMin {
    public static void main(String args[]){
        int num1, num2, num3, max, min;
        num1 = 23;
        num2 = 45;
        num3 = 75;
        
        // Find maximum value
        if(num1>num2 && num1>num3){
            max = num1;
        }
        else if (num2>num3){
            max = num2;
        }
        else{
            max =num3;
        }
        System.out.println("The Maximum of three number:"+max);
        
        // Find minimum value
        if(num1<num2 && num1<num3){
            min=num1;
        }
        else if (num2<num3){
            min =num2;
        }
        else{
            min=num3;
        }
        System.out.println("The minimum of three number:"+min);
    }
    
}
