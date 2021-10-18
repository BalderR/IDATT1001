package Øving6;

public class Matrise {
    private static int[][] matrix = {{2, 1}, {1, 1}};
    private static int[][] matrix2 = {{2, 1}, {1, 1}};
    public static matriseregning matrix_1 = new matriseregning(matrix);
    public static matriseregning matrix_2 = new matriseregning(matrix2);

    public static void main(String[] args) {

        System.out.println(matrix_1.toString());
        System.out.println(matrix_2.toString());

        System.out.println(matrix_1.addere(matrix_2).toString());
        System.out.println(matrix_1.multiply(matrix_2).toString());
        System.out.println(matrix_1.Transpose().toString());
    }
}
