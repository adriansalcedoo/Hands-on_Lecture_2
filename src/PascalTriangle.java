import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        int row = (int) (Math.random() * 31) ;
        // System.out.println((row));
        System.out.println(generate(row));

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    row.add(1);
                }
                else {
                    //  System.out.println(triangle.get(i - 1).get(j - 1));
                    // System.out.println(triangle.get(i - 1).get(j));
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}