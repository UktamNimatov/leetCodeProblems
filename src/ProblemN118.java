import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProblemN118 {
    public static void main(String[] args) {
        List<List<Integer>> lists = generate(5);
        System.out.println(Arrays.toString(lists.toArray()));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) return triangle;

        // FIRST ROW
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int rowIndex = 1; rowIndex < numRows; rowIndex++) {
            List<Integer> prevRow = triangle.get(rowIndex - 1);
            List<Integer> currentRow = new ArrayList<>();

            // SET FIRST ELEMENT
            currentRow.add(1);

            for (int j = 1; j < rowIndex; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // SET LAST ELEMENT
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }
}
