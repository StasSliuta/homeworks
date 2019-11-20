package homework3;

public class Task5 {
    public static void main(String[] args) {
        double[][] matrix = {{1.1, 1.2, 1.3},
                {1.4, 1.5, 1.6},
                {1.7, 1.8, 1.9},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        int row = 3;
        int column = 3;

        double[][] firstRotate = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                firstRotate[i][j] = matrix[row - j - 1][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(firstRotate[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        double[][] secondRotate = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                secondRotate[i][j] = firstRotate[row - j - 1][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(secondRotate[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        double[][] thirdRotate = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                thirdRotate[i][j] = secondRotate[row - j - 1][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(thirdRotate[i][j] + " ");
            }
            System.out.println();
        }
    }
}