public class Spiral {
    public static void arrayImplements(int[][] value) {
        int rowSrt = 0;
        int colSrt = 0;
        int rowStp = value.length - 1;
        int colStp = value[0].length - 1;

        while (rowSrt <= rowStp && colSrt <= colStp) {
            // Traverse from left to right
            for (int i = colSrt; i <= colStp; i++) {
                System.out.print(value[rowSrt][i] + " ");
            }
            rowSrt++; // Move the top boundary down

            // Traverse from top to bottom
            for (int i = rowSrt; i <= rowStp; i++) {
                System.out.print(value[i][colStp] + " ");
            }
            colStp--; // Move the right boundary left

            // Traverse from right to left, if still within bounds
            if (rowSrt <= rowStp) {
                for (int i = colStp; i >= colSrt; i--) {
                    System.out.print(value[rowStp][i] + " ");
                }
                rowStp--; // Move the bottom boundary up
            }

            // Traverse from bottom to top, if still within bounds
            if (colSrt <= colStp) {
                for (int i = rowStp; i >= rowSrt; i--) {
                    System.out.print(value[i][colSrt] + " ");
                }
                colSrt++; // Move the left boundary right
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        arrayImplements(array);
    }
}
