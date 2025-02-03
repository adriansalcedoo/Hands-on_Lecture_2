import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class test_cases {
    public static void main(String[] args) {

        int pascalRow =5;
        System.out.println("PASCAL TRIANGLE TEST");
         System.out.println("The number of rows is 5");
        System.out.println("Expected output: [[1],[1, 1],[1, 2, 1],[1, 3, 3, 1],[1, 4, 6, 4, 1]]");

        System.out.println("Output: "+ PascalTriangle.generate(pascalRow));
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("SPIRAL MATRIX TEST");
        System.out.println("The matrix is 5x5");
        System.out.println("Expected output: [1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13]\n");
        int row = 5 ;
        int column = 5;
        int number = 1;

//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//
//// Add rows and elements
//        for (int i = 0; i < m; i++) {
//            ArrayList<Integer> row = new ArrayList<>();
//            for (int j = 0; j < n; j++) {
//                row.add(number);
//                number++;
//            }
//            matrix.add(row);
//        }
//        System.out.println(matrix);
//        spiralOrder(matrix);


        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = number ;
                number++;
            }
        }
        SpiralMatrix.print2D(matrix);
        SpiralMatrix spiral = new SpiralMatrix();
        List<Integer> result = new ArrayList<>();
        result = spiral.spiralOrder(matrix);
        System.out.println("Output: "+result);
    }
}