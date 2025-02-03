import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int row = (int) (Math.random() * 9)+2 ;
        int column = (int) (Math.random() * 9) +2;
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
        print2D(matrix);
        SpiralMatrix spiral = new SpiralMatrix();
        List<Integer> result = new ArrayList<>();
        result = spiral.spiralOrder(matrix);
        System.out.println(result);



    }
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(colEnd>=colStart&&rowEnd>=rowStart) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            if(colEnd>=colStart&&rowEnd>=rowStart){
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
            }
            colStart++;
            //result.add(matrix[rowEnd][colEnd]);


        }
        return result;
    }
}
