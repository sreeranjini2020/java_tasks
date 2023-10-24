
class AllOperators {

    public static void main(String args[]) {
        int a, b, c;
        a = 4;
        b = 2;
        c = 56;

        //Arithmetic Operators
        System.out.println("Sum: " + (a + b));
        System.out.println("Differnce: " + (a - b));
        System.out.println("Product: " + a * b);
        System.out.println("Quotient: " + a / b);
        System.out.println("Square: " + a * a);
        System.out.println("Cube: " + b * b * b);
        System.out.println("Remainder: " + a % b);

        //Relational Operators
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less Than: " + (a < b));
        System.out.println("GreaterthanorEqual: " + (a >= b));
        System.out.println("LessthanoEqual: " + (a <= b));

        //Assignment Operators
        System.out.println(a += b);// a=a+b;
        System.out.println(a -= b);// a=a-b;
        System.out.println(a *= b);// a=a*b;
        System.out.println(a /= b);// a=a/b;

        //Logic Operators
        System.out.println("And Operator: " + (6 > 3 && 9 > 6));
        System.out.println("And Operator: " + (6 > 9 && 9 > 6));
        System.out.println("Or Operator: " + (6 > 3 || 9 > 6));
        System.out.println("Or Operator: " + (6 > 9 || 9 > 6));
        System.out.println("Not Operator: " + (!(9 == 6)));

        // Ternary Operator
        char gender = 'M';
        System.out.println("Result: " + ((gender == 'M') ? "Have fee" : "No fee"));

        //Increment Operators
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);

        //Decrement Operators
        a--;
        System.out.println(a);
        a--;
        System.out.println(a);

    }

}
