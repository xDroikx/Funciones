package prog2;


import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        int size, size1;
        int[][] matriz;

    matriz = pediryguardarvalores();
    System.out.println("Vamos a imprimir los valores menores a 20: ");
    valoresMenoresA20(matriz);
}

public static int[][] pediryguardarvalores() {
    int size, size1;
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese la dimension de las filas de la matriz:");
    size = scan.nextInt();
    System.out.println("Ingrese la dimension de las columnas de la matriz");
    size1 = scan.nextInt();
    int[][] matriz = new int[size][size1];

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size1; j++) {
            System.out.println("Ingrese un número para la posición (" + (i + 1) + ", " + (j + 1) + ") de la matriz");
            matriz[i][j] = scan.nextInt();
        }
    }

    return matriz;
}

public static void valoresMenoresA20(int[][] matriz) {
    boolean valores_menores_a_20 = false;
    int size = matriz.length;
    int size1 = matriz[0].length;

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size1; j++) {
            if (matriz[i][j] < 20) {
                System.out.println(matriz[i][j]);
                valores_menores_a_20 = true;
            }
        }
    }

    if (valores_menores_a_20) {
        System.out.println("Existen valores menores a 20 en la matriz");
    } else {
        System.out.println("No existen menores a 20 en la matriz");
    }
}
}