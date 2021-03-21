package HM2Bolshova;

public class Task4 {
    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
     *   и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static void main(String[] args) {
        int length = 5; // length of array

        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
