package guessinggame;

public class ArrayManager {
    public static void printArray(int array[][]) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
            System.out.print(array[fila][columna] + " ");
            } System.out.println();
        }
    }

    public static int[][] extendArray(int arrayOriginal[][]) {
        int arrayFinal[][] = new int[arrayOriginal.length + 1][arrayOriginal[0].length + 1];
        for (int filas = 0; filas < arrayOriginal.length; filas++) {
            for (int columnas = 0; columnas < arrayOriginal[0].length; columnas++) {
                arrayFinal[filas][columnas] = arrayOriginal[filas][columnas];
            }
        } return arrayFinal;
    } public static int[][] extendArrayVertical(int arrayOriginal[][]) {
        int arrayFinal[][] = new int[arrayOriginal.length + 1][arrayOriginal[0].length];
        for (int filas = 0; filas < arrayOriginal.length; filas++) {
            for (int columnas = 0; columnas < arrayOriginal[0].length; columnas++) {
                arrayFinal[filas][columnas] = arrayOriginal[filas][columnas];
            }
        } return arrayFinal;
    }
}
