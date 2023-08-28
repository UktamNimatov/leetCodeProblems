import java.util.ArrayList;
import java.util.List;

public class ProblemN118AndN119 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = generate(5);
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }

        System.out.println("<><><><><><><><><><><>");

        System.out.println(generateLastRow(4));
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

    public static List<Integer> generateLastRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (rowIndex <= 0) return List.of(1);

        // FIRST ROW
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int rowNumber = 1; rowNumber <= rowIndex; rowNumber++) {
            List<Integer> prevRow = triangle.get(rowNumber - 1);
            List<Integer> currentRow = new ArrayList<>();

            // SET FIRST ELEMENT
            currentRow.add(1);

            for (int j = 1; j < rowNumber; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // SET LAST ELEMENT
            currentRow.add(1);
            triangle.add(currentRow);
        }
        int size = triangle.size();
        return triangle.get(size - 1);
    }
}
