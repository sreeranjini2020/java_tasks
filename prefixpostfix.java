
class PrefixPostfix {

    public static void main(String args[]) {
        int a, b, x = 10, y = 45;
        a = x * ++y;
        b = x * y;
        System.out.println(a + " " + b);

        int c, d, u = 10, v = 76;
        c = u * v++;
        d = u * v;
        System.out.println(c + " " + d);
    }

}
