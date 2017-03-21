public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
            System.out.println(a + 10);


        int b = 100;
             System.out.println(b - 7);


        int c = 44;
             System.out.println(c * 2);


        int d = 125;
        System.out.println(d / (d * 5));


        int e = 8;
        System.out.println(e * e * e);


        int f1 = 123;
        int f2 = 345;
        boolean print1 = (f1 > f2);
        System.out.println(print1);


        int g1 = 350;
        int g2 = 200;
        boolean print2 = (g2 * 2) > g1;
        System.out.println(print2);



        long h = 1357988018575474l;
        boolean print3 = ((h % 11) == 0);
        System.out.println(print3);


        int i1 = 10;
        int i2 = 3;
        boolean print4 = ( i1 > (i2 * i2) || i1 < (i2 * i2 * i2));
        System.out.println(print4);


        int j = 1521;
        boolean print5 = ((j % 3) == 0 || (j % 5) == 0);
        System.out.println(print5);


        String k = "Apple";
        System.out.println(k + k + k + k);
    }
}