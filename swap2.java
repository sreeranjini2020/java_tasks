
class Swap2 {

    public static void main(String args[]) {
        int a = 45;
        int b = 109;

        System.out.println("a = " + a + " and b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + " and b = " + b);

    }

}
