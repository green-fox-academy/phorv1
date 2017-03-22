public class Matrix {
    public static void main(String[] args) {
        int[][] a;
        a = new int[4][4];
            for (int row = 0; row < a.length ; row++) {
                String sor ="";
                for (int column = 0; column < a[row].length; column++){
                    if (row == column) {
                       sor += " " + 1;
                    } else {
                        sor +=" " + 0;
                    }
                }
                System.out.println(sor);
            }
    }
}
