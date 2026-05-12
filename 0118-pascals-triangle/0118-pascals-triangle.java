class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Add the first row
        List<Integer> row0 = new ArrayList<>();
        row0.add(1);
        triangle.add(row0);

        // If only one row needed
        if (numRows == 1) return triangle;

        // Add the second row
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(1);
        triangle.add(row1);

        // Build remaining rows
        for (int i = 2; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1); // first element is always 1

            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currentRow.add(1); // last element is always 1
            triangle.add(currentRow);
        }

        return triangle;
    }
}
