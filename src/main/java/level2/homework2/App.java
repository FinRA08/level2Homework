package level2.homework2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        try {
            PassArray();
        }catch (MyArraySizeException e){
            System.out.println("Массив может быть только 4*4");
        }
    }


    private static void PassArray() throws MyArraySizeException {
        String[][] arrayw = new String[5][5];
        PrintA(arrayw);
    }


    private static void PrintA(String[][] arrayw) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < arrayw.length; i++) {
            for (int j = 0; j < arrayw[i].length; j++) {
                if (arrayw.length != 4 || arrayw[i].length != 4) {
                    System.out.println("Перехват");
                    throw new MyArraySizeException(arrayw);
                }
            }
        }
        System.out.println("Программа выполнена");
        int n = 1;
        int sum = 0;
        arrayw[1][3] = "Шляпа";
        System.out.println(Arrays.deepToString(arrayw));
        for (int i = 0; i < arrayw.length; i++) {
            for (int j = 0; j < arrayw[i].length; j++) {
                arrayw[i][j] = String.valueOf(n);
                n++;
            }
        }
//        arrayw[1][3] = "Шляпа";
        System.out.println(Arrays.deepToString(arrayw));
        int[][] arrayw2 = new int[4][4];
        for (int i = 0; i < arrayw.length; i++) {
            for (int j = 0; j < arrayw[i].length; j++) {
                arrayw2[i][j] = Integer.parseInt(arrayw[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(arrayw2));
        int x = arrayw2.length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                sum += arrayw2[i][j];{
                }
            }
        }
        System.out.println(sum);
    }
}
