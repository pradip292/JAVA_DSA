public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while (endRow >= startRow && endColumn >= startColumn) {
            // Top print
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }


            // Right side print
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }

            // Bottom print

            for (int j = endColumn-1; j >= startColumn; j--) {
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }



            // Left side print
            for (int i = endRow-1; i >= startRow+1; i--) {
                    if(startColumn==endColumn){
                        break;
                    }
                    System.out.print(matrix[i][startColumn] + " ");
            }
            startColumn++;
            endRow--;
            endColumn--;
            startRow++;

        }
    }

}
